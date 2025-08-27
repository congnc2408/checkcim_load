package com.autotest.check_cimload.config;

import com.autotest.check_cimload.model.ZimiMstrId;
import com.autotest.check_cimload.model.Zimi_Mstr;
import com.mysql.cj.x.protobuf.MysqlxResultset;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExcelConfig {
    public void importExcel(TableView tblExcel) {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Chọn file Excel");
            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("Excel Files", "*.xls", "*.xlsx", "*.xlsm")
            );

            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("CSV Files", "*.csv")
            );

            File fileSelected = fileChooser.showOpenDialog(null);
            if (fileSelected != null) {
                FileInputStream fis = new FileInputStream(fileSelected);
                XSSFWorkbook wb = new XSSFWorkbook(fis);
                Sheet sheet = wb.getSheetAt(0);

                // Clear existing data in the TableView
                tblExcel.getItems().clear();

                ObservableList<Zimi_Mstr> excelData = FXCollections.observableArrayList();

                // Start from row 1 to skip header
                Iterator<Row> rowIterator = sheet.iterator();
                if(rowIterator.hasNext()) {
                    rowIterator.next(); // Skip header row
                }
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Zimi_Mstr zimiRecord = new Zimi_Mstr();

                    // Populate Zimi_Mstr object from Excel row
                    // You must map each cell to the correct field
                    // Example:
                    // zimiRecord.setZimiId(row.getCell(0).getStringCellValue());
                    // zimiRecord.setZimiDecision(row.getCell(1).getStringCellValue());

                    excelData.add(zimiRecord);
                }

                tblExcel.setItems(excelData);


                // You may want to save this data to the DB as part of your "check" logic
                // zimiService.saveAll(excelData);

                new Alert(Alert.AlertType.INFORMATION, "Nhập file Excel thành công!").showAndWait();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Nhập file Excel thất bại.").showAndWait();
            e.printStackTrace();
        }
    }

    public  <T> List<T> testImportExcel(File file, Class<T> clazz) {
        List<T> resultList = new ArrayList<>();
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder().build();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try(FileReader reader = new FileReader(file)) {
            CSVParser parser = new CSVParser(reader,csvFormat);
            for (CSVRecord record : parser){
              T obj = clazz.getDeclaredConstructor().newInstance();
              if (obj instanceof Zimi_Mstr){
                  Zimi_Mstr zimi_mstr = (Zimi_Mstr) obj;
                  ZimiMstrId zimiMstrId = new ZimiMstrId();
                  zimiMstrId.setzIMI_Id(record.get(0));
                  zimiMstrId.setzIMI_Site(record.get(13));
                  zimi_mstr.setId(zimiMstrId);
                  zimi_mstr.setzIMI_Decision(record.get(1));
                  zimi_mstr.setzIMI_Part(record.get(2));
                  zimi_mstr.setzIMI_Sample(Integer.parseInt(record.get(3)));
                  zimi_mstr.setzIMI_Insp(record.get(10));
                  zimi_mstr.setzIMI_Vendor(record.get(12));
                  String dateStr = record.get(14);
                  Date rcpdate = sdf.parse(dateStr);
                  zimi_mstr.setzIMI_Rcpdate(rcpdate);
                  zimi_mstr.setzIMI_Buyer(record.get(15));
              }
                resultList.add(obj);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (T abc : resultList){
            if (abc instanceof Zimi_Mstr) {
                Zimi_Mstr zimi_mstr = (Zimi_Mstr) abc;
                System.out.println("ID: " + zimi_mstr.getId().getzIMI_Id());
                System.out.println("Decision: " + zimi_mstr.getzIMI_Decision());
                System.out.println("Part: " + zimi_mstr.getzIMI_Part());
                System.out.println("Sample: " + zimi_mstr.getzIMI_Sample());
                System.out.println("Insp: " + zimi_mstr.getzIMI_Insp());
                System.out.println("Vendor: " + zimi_mstr.getzIMI_Vendor());
                System.out.println("Site: " + zimi_mstr.getId().getzIMI_Site());
                System.out.println("Rcpdate: " + zimi_mstr.getzIMI_Rcpdate());
                System.out.println("Buyer: " + zimi_mstr.getzIMI_Buyer());
            }
        }
        return resultList;
    }
}

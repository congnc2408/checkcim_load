package com.autotest.check_cimload;

import com.autotest.check_cimload.config.ButtonClickHandler;
import com.autotest.check_cimload.config.ExcelConfig;
import com.autotest.check_cimload.config.ViewTable;
import com.autotest.check_cimload.model.Zimi_Mstr;
import com.autotest.check_cimload.model.Imid_Daily;
import com.autotest.check_cimload.service.Zimi_Service_Imp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainController {

    @FXML
    private Button btnChoose;

    @FXML
    private Button btnCheck;

    @FXML
    private Button btnReset;

    @FXML
    private TableView<Zimi_Mstr> tblExcel;

    @FXML
    private TableView<Zimi_Mstr> tblZIMI;

    @FXML private TableColumn<Zimi_Mstr, String> zimiIdColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiDecisionColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiPartColumn;
    @FXML private TableColumn<Zimi_Mstr, Integer> zimiSampleColumn;
    @FXML private TableColumn<Imid_Daily, String> imidModDateColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiMrbcodeColumn;
    @FXML private TableColumn<Zimi_Mstr, Integer> zimiDefqtyColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiMrbcode1Column;
    @FXML private TableColumn<Zimi_Mstr, Integer> zimiDefqty1Column;
    @FXML private TableColumn<Zimi_Mstr, String> zimiMrbcode2Column;
    @FXML private TableColumn<Zimi_Mstr, Integer> zimiDefqty2Column;
    @FXML private TableColumn<Zimi_Mstr, String> zimiInspColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiMrbstatColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiVendColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiSiteColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiRcpdateColumn;
    @FXML private TableColumn<Zimi_Mstr, String> zimiBuyerColumn;


    @FXML private TableColumn<Zimi_Mstr, String> idColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> decisionColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> partColumnEx;
    @FXML private TableColumn<Zimi_Mstr, Integer> sampleColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> inspColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> vendColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> siteColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> rcpdateColumnEx;
    @FXML private TableColumn<Zimi_Mstr, String> buyerColumnEx;

    private Stage primaryStage;

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @FXML
    public void initialize() {
        zimiIdColumn = ViewTable.createColumn("ID", record -> record.getId().getzIMI_Id());
        zimiDecisionColumn = ViewTable.createColumn("Decision", record -> record.getzIMI_Decision());
        zimiPartColumn = ViewTable.createColumn("Part", record -> record.getzIMI_Part());
        zimiSampleColumn = ViewTable.createColumn("Sample", record -> record.getzIMI_Sample());
        imidModDateColumn = ViewTable.createColumn("Mod_date",record -> {
           Date date = record.getImid_mod_date();
           return sdf.format(date);
        });
        zimiInspColumn = ViewTable.createColumn("Insp", record -> record.getzIMI_Insp());
        zimiVendColumn = ViewTable.createColumn("Vendor", record -> record.getzIMI_Vendor());
        zimiSiteColumn = ViewTable.createColumn("Site", record -> record.getId().getzIMI_Site());

        zimiRcpdateColumn = ViewTable.createColumn("Rcpdate", record ->{
            Date date =  record.getzIMI_Rcpdate();
            return sdf.format(date);
        });

        zimiBuyerColumn = ViewTable.createColumn("Buyer",record -> record.getzIMI_Buyer());

        tblZIMI.getColumns().addAll(zimiIdColumn, zimiDecisionColumn,zimiPartColumn,zimiSampleColumn,zimiInspColumn
                ,zimiVendColumn, zimiSiteColumn,zimiRcpdateColumn,zimiBuyerColumn);
        loadZimiData();

        idColumnEx = ViewTable.createColumn("ID", record -> record.getId().getzIMI_Id());
        decisionColumnEx = ViewTable.createColumn("Decision", record -> record.getzIMI_Decision());
        partColumnEx = ViewTable.createColumn("Part", record -> record.getzIMI_Part());
        sampleColumnEx = ViewTable.createColumn("Sample", record -> record.getzIMI_Sample());
        inspColumnEx = ViewTable.createColumn("Insp", record -> record.getzIMI_Insp());
        vendColumnEx = ViewTable.createColumn("Vendor", record -> record.getzIMI_Vendor());
        siteColumnEx = ViewTable.createColumn("Site", record -> record.getId().getzIMI_Site());
        rcpdateColumnEx = ViewTable.createColumn("Rcpdate", record -> {
            Date date = record.getzIMI_Rcpdate();
            return sdf.format(date);
        });
        buyerColumnEx = ViewTable.createColumn("Buyer",record -> record.getzIMI_Buyer());
        tblExcel.getColumns().addAll(idColumnEx,decisionColumnEx,partColumnEx,sampleColumnEx,inspColumnEx,
                vendColumnEx, siteColumnEx,rcpdateColumnEx,buyerColumnEx);

    }


//    private TableColumn<Zimi_Mstr, String> createStringColumn(String title, Callback<Zimi_Mstr, String> valueExtractor) {
//        TableColumn<Zimi_Mstr, String> column = new TableColumn<>(title);
//        column.setCellValueFactory(cellData -> {
//            // Lấy giá trị từ hàm được truyền vào
//            String value = valueExtractor.call(cellData.getValue());
//            return new SimpleStringProperty(value != null ? value : "");
//        });
//        return column;
//    }

    public  void loadZimiData() {
        ObservableList<Zimi_Mstr> zimiData = FXCollections.observableArrayList();
        // Assuming Zimi_Service_Imp is a service class that fetches data from the database
        Zimi_Service_Imp zimiService = new Zimi_Service_Imp();
        zimiData.addAll(zimiService.getZimiList());
        tblZIMI.setItems(zimiData);
    }

    public void importExcelData() {
        ButtonClickHandler btn = new ButtonClickHandler();
        File file =  btn.handleButtonClickFileChooser(btnChoose, primaryStage);
        if (file != null) {
            ExcelConfig excelConfig = new ExcelConfig();
            List<Zimi_Mstr> excelData = excelConfig.testImportExcel(file, Zimi_Mstr.class);
            ObservableList<Zimi_Mstr> observableList = FXCollections.observableArrayList(excelData);
            tblExcel.setItems(observableList);
        }
    }

    @FXML
    public void chooseFile(ActionEvent actionEvent) {
        importExcelData();
    }

    @FXML
    public void Check(ActionEvent actionEvent) {
        ObservableList<Zimi_Mstr> tableExcel = tblExcel.getItems();
        List<Zimi_Mstr> lstExcel = new ArrayList<>(tableExcel);
        System.out.println("Excel List: " + lstExcel.size());
        ObservableList<Zimi_Mstr> tableZimi = tblZIMI.getItems();
        List<Zimi_Mstr> lstZimi = new ArrayList<>(tableZimi);
        System.out.println("Zimi List: " + lstZimi.size());
        compareAndFilterData(lstExcel, lstZimi);


    }

    private void compareAndFilterData(List<Zimi_Mstr> lstExcel, List<Zimi_Mstr> lstZimi) {
        System.out.println("click");

        Set<String> zimiIdsInZimi = lstZimi.stream()
                .map(zimi -> zimi.getId().getzIMI_Id())
                .collect(Collectors.toSet());

        List<Zimi_Mstr> differenceRecords = lstExcel.stream()
                .filter(zimi -> !zimiIdsInZimi.contains(zimi.getId().getzIMI_Id()))
                .collect(Collectors.toList());

        ObservableList<Zimi_Mstr> observableList = FXCollections.observableArrayList(differenceRecords);
        System.out.println("Difference List: " + differenceRecords.size());
        tblExcel.setItems(observableList);
    }

    public void Reset(ActionEvent actionEvent) {
        tblExcel.getItems().clear();
        Check(actionEvent);
    }
}

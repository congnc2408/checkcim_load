module com.autotest.check_cimload {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires mysql.connector.j;

    requires org.hibernate.orm.core;


    opens com.autotest.check_cimload to javafx.fxml;
    exports com.autotest.check_cimload;

    requires java.naming;
    requires java.persistence;
    requires java.sql;
    requires static lombok;
    requires org.apache.poi.ooxml;
    requires org.apache.commons.csv;

    opens com.autotest.check_cimload.model to org.hibernate.orm.core;
}

// module-info.java

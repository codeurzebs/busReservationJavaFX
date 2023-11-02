module com.codeurzebs.busreservationjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.codeurzebs.busreservationjavafx to javafx.fxml;
    exports com.codeurzebs.busreservationjavafx;
}
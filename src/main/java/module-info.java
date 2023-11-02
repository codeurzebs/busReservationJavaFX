module com.codeurzebs.busreservationjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.codeurzebs.busreservationjavafx to javafx.fxml;
    exports com.codeurzebs.busreservationjavafx;
}
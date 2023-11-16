module com.codeurzebs.busreservationjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.codeurzebs.busreservationjavafx to javafx.fxml;
    exports com.codeurzebs.busreservationjavafx;

    opens com.codeurzebs.busreservationjavafx.controllers to javafx.fxml;
    exports com.codeurzebs.busreservationjavafx.controllers;

    opens com.codeurzebs.busreservationjavafx.application to javafx.fxml;
    exports com.codeurzebs.busreservationjavafx.application;
}
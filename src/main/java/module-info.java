module com.example.payrollcalculcator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.payrollcalculcator to javafx.fxml;
    exports com.example.payrollcalculcator;
}
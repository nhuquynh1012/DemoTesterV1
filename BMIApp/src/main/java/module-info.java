module com.pnnq.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pnnq.bmiapp to javafx.fxml;
    exports com.pnnq.bmiapp;
}

module com.pnnq.bmitestapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pnnq.bmitestapp to javafx.fxml;
    exports com.pnnq.bmitestapp;
}

module com.example.itc313_assessment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.itc313_assessment2 to javafx.fxml;
    exports com.example.itc313_assessment2.task1;
    exports com.example.itc313_assessment2;
}
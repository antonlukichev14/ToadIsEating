module com.example.toadiseating {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.toadiseating to javafx.fxml;
    exports com.example.toadiseating;
}
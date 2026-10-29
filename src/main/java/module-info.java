module org.blockchainvotingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.blockchainvotingsystem to javafx.fxml;
    exports org.blockchainvotingsystem;
}
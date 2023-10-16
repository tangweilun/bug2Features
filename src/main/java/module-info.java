module com.example.bug2features {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                    requires org.kordamp.bootstrapfx.core;
            
    opens com.example.bug2features to javafx.fxml;
    exports com.example.bug2features;
}
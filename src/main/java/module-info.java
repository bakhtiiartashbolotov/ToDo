module com.bakhtiiar.todo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.bakhtiiar.todo to javafx.fxml;
    exports com.bakhtiiar.todo;
}
module com.example.arthimethicscalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.arthimethicscalc to javafx.fxml;
    exports com.example.arthimethicscalc;
}
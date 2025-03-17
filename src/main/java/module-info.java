module com.iessanalberto.dam1.tallerespirineos {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.iessanalberto.dam1.tallerespirineos to javafx.fxml;
    exports com.iessanalberto.dam1.tallerespirineos;
}
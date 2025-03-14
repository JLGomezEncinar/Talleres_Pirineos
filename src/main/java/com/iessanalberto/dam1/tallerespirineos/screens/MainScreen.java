package com.iessanalberto.dam1.tallerespirineos.screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainScreen {
    VBox root = new VBox();
    HBox fila1 = new HBox();
    TextField txtBusqueda = new TextField();
    ComboBox cmbBusqueda = new ComboBox();
    Button btnBusqueda = new Button("Buscar");

    public MainScreen() {

        root.setPadding(new Insets(10));
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        fila1.setAlignment(Pos.CENTER);
        fila1.setPadding(new Insets(0, 20, 0, 0));
        fila1.setSpacing(20);
        fila1.getChildren().addAll(txtBusqueda,cmbBusqueda);
        root.getChildren().addAll(fila1,btnBusqueda);
        cmbBusqueda.getItems().addAll("Matrícula","DNI");
        cmbBusqueda.getSelectionModel().selectFirst();
        txtBusqueda.setPromptText("DNI/Matrícula");
    }

    public VBox getRoot() {
        return root;
    }
}

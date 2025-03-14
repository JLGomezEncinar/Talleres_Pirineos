package com.iessanalberto.dam1.tallerespirineos.screens;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import com.iessanalberto.dam1.tallerespirineos.navigation.Navigation;
import com.iessanalberto.dam1.tallerespirineos.services.ClientService;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainScreen {
    VBox root = new VBox();
    HBox fila1 = new HBox();
    TextField txtBusqueda = new TextField();
    ComboBox cmbBusqueda = new ComboBox();
    Button btnBusqueda = new Button("Buscar");
    //Añadimos los servicios necesarios para la ventana
    private ClientService clientService = new ClientService();
    public MainScreen() {
        // Configuramos los componentes al layout
        root.setPadding(new Insets(10));
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        fila1.setAlignment(Pos.CENTER);
        fila1.setPadding(new Insets(0, 20, 0, 0));
        fila1.setSpacing(20);
        // Añadimos los elementos al layout
        fila1.getChildren().addAll(txtBusqueda,cmbBusqueda);
        root.getChildren().addAll(fila1,btnBusqueda);
        cmbBusqueda.getItems().addAll("Matrícula","DNI");
        cmbBusqueda.getSelectionModel().selectFirst();
        txtBusqueda.setPromptText("DNI/Matrícula");
        // Configuramos la interactividad de la ventana
        //Con el enter buscamos
        root.setOnKeyPressed(keyEvent -> {
            if(keyEvent.getCode().equals(KeyCode.ENTER)) {
                btnBusqueda.fire();
            }
        });
        btnBusqueda.setOnAction(event -> {
            if (cmbBusqueda.getValue().equals("DNI")) {
                try {

                    Navigation.navigate("ClienteScreen", clientService.buscarCliente(txtBusqueda.getText()));
                } catch (Exception exception){

                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Cliente no encontrado");
                    alert.setHeaderText("Error al recuperar el cliente");
                    alert.setContentText(exception.getMessage());
                    alert.showAndWait();


                }
            }
        });
    }

    public VBox getRoot() {
        return root;
    }
}

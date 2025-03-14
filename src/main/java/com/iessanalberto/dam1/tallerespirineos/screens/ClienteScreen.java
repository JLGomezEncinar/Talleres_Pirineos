package com.iessanalberto.dam1.tallerespirineos.screens;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ClienteScreen {
    // Definimos los elementos de layuot
 private VBox root = new VBox();
 private GridPane gridPane = new GridPane();
 // Definimos los componentes de la ventana
    private Label lblNombre = new Label("Nombre");
    private TextField txtNombre = new TextField();
    private Label lblApellidos = new Label("Apellidos");
    private TextField txtApellidos = new TextField();
    private Label lblDni = new Label("DNI");
    private TextField txtDni = new TextField();
    private Label lblTelefono = new Label("Teléfono");
    private TextField txtTelefono = new TextField();
    private Label lblDireccion = new Label("Dirección");
    private TextField txtDireccion = new TextField();

    public ClienteScreen(Cliente cliente) {
        // Definimos los parámetros del layout
        root.setPadding(new Insets(10));
        root.setSpacing(10);
        txtNombre.setEditable(false);
        txtApellidos.setEditable(false);
        txtDni.setEditable(false);
        txtTelefono.setEditable(false);
        txtDireccion.setEditable(false);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        // Añadimos los elementos al GridPane
        gridPane.add(lblNombre,0,0);
        gridPane.add(txtNombre,1,0);
        gridPane.add(lblApellidos,0,1);
        gridPane.add(txtApellidos,1,1);
        gridPane.add(lblDni,0,2);
        gridPane.add(txtDni,1,2);
        gridPane.add(lblTelefono,2,2);
        gridPane.add(txtTelefono,3,2);
        gridPane.add(lblDireccion,0,3);
        gridPane.add(txtDireccion,1,3);
        root.getChildren().addAll(gridPane);
        // Añadimos los datos del cliente al cliente correspondientes
        txtNombre.setText(cliente.getNombre());
        txtApellidos.setText(cliente.getApellidos());
        txtDni.setText(cliente.getDni());
        txtTelefono.setText(cliente.getTelefono());
        txtDireccion.setText(cliente.getDireccion());
    }

    public VBox getRoot() {
        return root;
    }
}

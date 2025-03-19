package com.iessanalberto.dam1.tallerespirineos.screens;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import com.iessanalberto.dam1.tallerespirineos.models.Coche;
import com.iessanalberto.dam1.tallerespirineos.navigation.Navigation;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView<Coche> tblCoches = new TableView();
    private Button btnVolver = new Button("Volver");
    // Columnas de la tabla
    private TableColumn<Coche,String> colMatricula = new TableColumn<>("Matrícula");
    private TableColumn<Coche,String> colMarca = new TableColumn<>("Marca");
    private TableColumn<Coche,String> colModelo = new TableColumn<>("Modelo");
    private TableColumn<Coche,Integer> colKm = new TableColumn<>("Kilometros");


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
        tblCoches.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
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
        //Añadimos la tabla
        gridPane.add(tblCoches,0,4,5,1);
        gridPane.add(btnVolver,10,10);
        tblCoches.getColumns().addAll(colMatricula,colMarca,colModelo,colKm);
        tblCoches.getItems().add(new Coche("1234AAA","Seat","Ateca",100000));
        // Asignamos las columnas a la tabla

        colMatricula.setCellValueFactory(new PropertyValueFactory<Coche,String>("matricula"));
        colMarca.setCellValueFactory(new PropertyValueFactory<Coche,String>("marca"));
        colModelo.setCellValueFactory(new PropertyValueFactory<Coche,String>("modelo"));
        colKm.setCellValueFactory(new PropertyValueFactory<Coche,Integer>("kilometros"));

        root.getChildren().addAll(gridPane);
        // Añadimos los datos del cliente al cliente correspondientes
        txtNombre.setText(cliente.getNombre());
        txtApellidos.setText(cliente.getApellidos());
        txtDni.setText(cliente.getDni());
        txtTelefono.setText(cliente.getTelefono());
        txtDireccion.setText(cliente.getDireccion());
        //Definimos los componentes de la tabla de Coches
        btnVolver.setOnAction(event -> Navigation.navigate("MainScreen"));

    }

    public VBox getRoot() {
        return root;
    }
}

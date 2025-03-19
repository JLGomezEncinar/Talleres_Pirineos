package com.iessanalberto.dam1.tallerespirineos.screens;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import com.iessanalberto.dam1.tallerespirineos.models.Coche;
import com.iessanalberto.dam1.tallerespirineos.navigation.Navigation;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CocheScreen {
    // Definimos los elementos de layuot
    private VBox root = new VBox();
    private GridPane gridPane = new GridPane();
    // Definimos los componentes de la ventana
    private Label lblMatricula = new Label("Matrícula");
    private TextField txtMatricula = new TextField();
    private Label lblMarca = new Label("Marca");
    private TextField txtMarca = new TextField();
    private Label lblModelo = new Label("Modelo");
    private TextField txtModelo = new TextField();
    private Label lblKms = new Label("Kilómetros");
    private TextField txtKms = new TextField();

    private TableView<Cliente> tblClientes = new TableView();
    private Button btnVolver = new Button("Volver");
    // Columnas de la tabla
    private TableColumn<Cliente,String> colDni = new TableColumn<>("DNI");
    private TableColumn<Cliente,String> colNombre= new TableColumn<>("Nombre");
    private TableColumn<Cliente,String> colApellidos = new TableColumn<>("Apellidos");
    private TableColumn<Cliente,String> colTelefono = new TableColumn<>("Telefono");
    private TableColumn<Cliente,String> colDireccion = new TableColumn<>("Direccion");


    public CocheScreen (Coche coche) {
        // Definimos los parámetros del layout
        root.setPadding(new Insets(10));
        root.setSpacing(10);
        txtMatricula.setEditable(false);
        txtMarca.setEditable(false);
        txtModelo.setEditable(false);
        txtKms.setEditable(false);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        tblClientes.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        // Añadimos los elementos al GridPane
        gridPane.add(lblMatricula,0,0);
        gridPane.add(txtMatricula,1,0);
        gridPane.add(lblMarca,0,1);
        gridPane.add(txtMarca,1,1);
        gridPane.add(lblModelo,0,2);
        gridPane.add(txtModelo,1,2);
        gridPane.add(lblKms,2,2);
        gridPane.add(txtKms,3,2);
        //Añadimos la tabla
        gridPane.add(tblClientes,0,4,4,1);
        gridPane.add(btnVolver,10,10);
        tblClientes.getColumns().addAll(colDni,colNombre,colApellidos,colTelefono,colDireccion);
        tblClientes.getItems().add(new Cliente("12345678Z","Juan","Pérez","612345678","Calle Falsa 123"));
        // Asignamos las columnas a la tabla

        colDni.setCellValueFactory(new PropertyValueFactory<Cliente,String>("dni"));
        colNombre.setCellValueFactory(new PropertyValueFactory<Cliente,String>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<Cliente,String>("apellidos"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<Cliente,String>("telefono"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<Cliente,String>("direccion"));
        root.getChildren().addAll(gridPane);
        // Añadimos los datos del cliente al cliente correspondientes
        txtMatricula.setText(coche.getMatricula());
        txtMarca.setText(coche.getMarca());
        txtModelo.setText(coche.getModelo());
        txtKms.setText(String.valueOf(coche.getKilometros()));
        //Definimos los componentes de la tabla de Coches
        btnVolver.setOnAction(event -> Navigation.navigate("MainScreen"));

    }

    public VBox getRoot() {
        return root;
    }
}
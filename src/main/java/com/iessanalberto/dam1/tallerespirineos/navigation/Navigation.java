package com.iessanalberto.dam1.tallerespirineos.navigation;


import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import com.iessanalberto.dam1.tallerespirineos.models.Coche;
import com.iessanalberto.dam1.tallerespirineos.screens.CocheScreen;
import com.iessanalberto.dam1.tallerespirineos.screens.ClienteScreen;
import com.iessanalberto.dam1.tallerespirineos.screens.MainScreen;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigation {
    public static Stage stage = new Stage();

    public static void navigate(String destination) {
        switch (destination) {
            case "MainScreen" -> {
                MainScreen mainScreen = new MainScreen();
                Scene mainScene = new Scene(mainScreen.getRoot(), 480, 240);
                stage.setTitle("Talleres Pirineos");
                stage.setScene(mainScene);
                stage.show();
            }

        }
    }

    public static void navigate(String destination, Cliente cliente) {
        switch (destination) {
            case "ClienteScreen" -> {
                ClienteScreen clienteScreen = new ClienteScreen(cliente);
                Scene clienteScene = new Scene(clienteScreen.getRoot(), 800, 600);
                stage.setTitle("Clientes");
                stage.setScene(clienteScene);
                stage.show();
            }
        }
    }
    public static void navigate(String destination, Coche coche) {
        switch (destination) {
            case "CocheScreen" -> {
                CocheScreen cocheScreen = new CocheScreen(coche);
                Scene cocheScene = new Scene(cocheScreen.getRoot(), 800, 600);
                stage.setTitle("Coches");
                stage.setScene(cocheScene);
                stage.show();
            }
        }
    }
}

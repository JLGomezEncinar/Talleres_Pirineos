package com.iessanalberto.dam1.tallerespirineos.repositories;

import com.iessanalberto.dam1.tallerespirineos.models.Coche;


import java.util.HashMap;
import java.util.Map;

public class CocheRepository {
    // Propiedades
    private static CocheRepository cocheRepository;
    private Map<String, Coche> mapaCoches = new HashMap<>();
    // Patrón Singleton - Constructor privado, incluye la carga manual del mapa
    private CocheRepository(){
        cargarMapa();

    }
    // Carga inicial del mapa


    public static CocheRepository getInstance() {
        if (cocheRepository == null) {
            cocheRepository = new CocheRepository();
                     
        }
        return cocheRepository;
    }
    private void cargarMapa() {
        // Cargamos 30 coches manualmente
        mapaCoches.put("1234AAA", new Coche("1234AAA", "Seat", "León", 145000));
        mapaCoches.put("5678BBB", new Coche("5678BBB", "Renault", "Clio", 120000));
        mapaCoches.put("9101CCC", new Coche("9101CCC", "Peugeot", "208", 98000));
        mapaCoches.put("1121DDD", new Coche("1121DDD", "Ford", "Focus", 110000));
        mapaCoches.put("3141EEE", new Coche("3141EEE", "Opel", "Astra", 132000));
        mapaCoches.put("5161FFF", new Coche("5161FFF", "Volkswagen", "Golf", 150000));
        mapaCoches.put("7181GGG", new Coche("7181GGG", "Toyota", "Corolla", 125000));
        mapaCoches.put("9202HHH", new Coche("9202HHH", "Honda", "Civic", 115000));
        mapaCoches.put("1222III", new Coche("1222III", "BMW", "Serie 3", 90000));
        mapaCoches.put("3242JJJ", new Coche("3242JJJ", "Mercedes", "Clase A", 105000));
        mapaCoches.put("5262KKK", new Coche("5262KKK", "Audi", "A3", 140000));
        mapaCoches.put("7282LLL", new Coche("7282LLL", "Nissan", "Qashqai", 135000));
        mapaCoches.put("9303MMM", new Coche("9303MMM", "Hyundai", "i30", 118000));
        mapaCoches.put("1323NNN", new Coche("1323NNN", "Kia", "Ceed", 97000));
        mapaCoches.put("3343OOO", new Coche("3343OOO", "Mazda", "3", 128000));
        mapaCoches.put("5363PPP", new Coche("5363PPP", "Citroën", "C4", 143000));
        mapaCoches.put("7383QQQ", new Coche("7383QQQ", "Fiat", "Punto", 89000));
        mapaCoches.put("9404RRR", new Coche("9404RRR", "Suzuki", "Swift", 102000));
        mapaCoches.put("1424SSS", new Coche("1424SSS", "Subaru", "Impreza", 110000));
        mapaCoches.put("3444TTT", new Coche("3444TTT", "Dacia", "Duster", 98000));
        mapaCoches.put("5464UUU", new Coche("5464UUU", "Jeep", "Renegade", 108000));
        mapaCoches.put("7484VVV", new Coche("7484VVV", "Mitsubishi", "Lancer", 94000));
        mapaCoches.put("9505WWW", new Coche("9505WWW", "Volvo", "V40", 130000));
        mapaCoches.put("1525XXX", new Coche("1525XXX", "Tesla", "Model 3", 85000));
        mapaCoches.put("3545YYY", new Coche("3545YYY", "Alfa Romeo", "Giulietta", 97000));
        mapaCoches.put("5565ZZZ", new Coche("5565ZZZ", "Jaguar", "XE", 92000));
        mapaCoches.put("7585AAA", new Coche("7585AAA", "Porsche", "Macan", 78000));
        mapaCoches.put("9606BBB", new Coche("9606BBB", "Land Rover", "Evoque", 99000));
        mapaCoches.put("1626CCC", new Coche("1626CCC", "Mini", "Cooper", 88000));
    }
    // Métodos del repositorio
    public Coche buscarCoche (String matricula) throws Exception {
        Coche coche = mapaCoches.get(matricula);
                if (coche == null) {
                    throw new Exception("El coche con matrícula " + matricula + " no existe en el sistema");
                }
        return coche;
    }

}

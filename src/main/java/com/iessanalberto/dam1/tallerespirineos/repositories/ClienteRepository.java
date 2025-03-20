package com.iessanalberto.dam1.tallerespirineos.repositories;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClienteRepository {
    // Propiedades
    private static ClienteRepository clienteRepository;
    private Map<String, Cliente> mapaClientes = new HashMap<>();
    // Patrón Singleton - Constructor privado, incluye la carga manual del mapa
    private ClienteRepository(){
        //cargarMapa();
        cargarMapaFichero();

    }
    // Carga inicial del mapa


    public static ClienteRepository getInstance() {
        if (clienteRepository == null) {
            clienteRepository = new ClienteRepository();
                     
        }
        return clienteRepository;
    }
    // Carga inicial del mapa con fichero
    private void cargarMapaFichero() {
        try{
            BufferedReader reader =
                    new BufferedReader(new FileReader("entrada.txt"));
            String line = reader.readLine();
            while (line != null) {
                String [] lineaTroceada = line.split(";");
                mapaClientes.put(lineaTroceada[0],new Cliente(lineaTroceada[0],lineaTroceada[1],lineaTroceada[2],lineaTroceada[3],lineaTroceada[4]));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void cargarMapa() {
        mapaClientes.put("72051564Q", new Cliente ("72051564Q","José Luis","Gómez", "600000000","Casa"));
        mapaClientes.put("12345678Z", new Cliente("12345678Z", "Juan", "Pérez", "600123456", "Calle Falsa 123"));
        mapaClientes.put("87654321B", new Cliente("87654321B", "Ana", "López", "611987654", "Avenida Siempre Viva 742"));
        mapaClientes.put("11223344C", new Cliente("11223344C", "Carlos", "Gómez", "622345678", "Plaza Mayor 5"));
        mapaClientes.put("22334455D", new Cliente("22334455D", "María", "Fernández", "633456789", "Calle Sol 10"));
        mapaClientes.put("33445566E", new Cliente("33445566E", "Luis", "Ramírez", "644567890", "Paseo del Prado 20"));
        mapaClientes.put("44556677F", new Cliente("44556677F", "Elena", "Martínez", "655678901", "Ronda Norte 15"));
        mapaClientes.put("55667788G", new Cliente("55667788G", "Pedro", "Sánchez", "666789012", "Avenida Sur 8"));
        mapaClientes.put("66778899H", new Cliente("66778899H", "Laura", "Torres", "677890123", "Calle Luna 25"));
        mapaClientes.put("77889900I", new Cliente("77889900I", "Diego", "Navarro", "688901234", "Camino Real 3"));
        mapaClientes.put("88990011J", new Cliente("88990011J", "Carmen", "Ruiz", "699012345", "Calle Jardín 14"));
        mapaClientes.put("99001122K", new Cliente("99001122K", "Alberto", "Hernández", "600123987", "Avenida Mar 12"));
        mapaClientes.put("10111213L", new Cliente("10111213L", "Isabel", "Ortega", "611234876", "Plaza Central 6"));
        mapaClientes.put("12131415M", new Cliente("12131415M", "Javier", "Gil", "622345765", "Paseo Verde 9"));
        mapaClientes.put("13141516N", new Cliente("13141516N", "Beatriz", "Castillo", "633456654", "Calle Azul 18"));
        mapaClientes.put("14151617O", new Cliente("14151617O", "Francisco", "Mendoza", "644567543", "Ronda Oeste 21"));
        mapaClientes.put("15161718P", new Cliente("15161718P", "Rosa", "Delgado", "655678432", "Avenida Norte 5"));
        mapaClientes.put("16171819Q", new Cliente("16171819Q", "Manuel", "Vega", "666789321", "Calle Sol 22"));
        mapaClientes.put("17181920R", new Cliente("17181920R", "Cristina", "Iglesias", "677890210", "Paseo Este 7"));
        mapaClientes.put("18192021S", new Cliente("18192021S", "Sergio", "Domínguez", "688901109", "Avenida Oeste 16"));
        mapaClientes.put("19202122T", new Cliente("19202122T", "Marta", "Moreno", "699012998", "Calle Primavera 1"));
        mapaClientes.put("20212223U", new Cliente("20212223U", "Daniel", "Reyes", "600123777", "Plaza del Sol 23"));
        mapaClientes.put("21222324V", new Cliente("21222324V", "Paula", "Cabrera", "611234666", "Calle Río 30"));
        mapaClientes.put("22232425W", new Cliente("22232425W", "Fernando", "Giménez", "622345555", "Paseo del Mar 19"));
        mapaClientes.put("23242526X", new Cliente("23242526X", "Sara", "Salazar", "633456444", "Camino de la Sierra 4"));
        mapaClientes.put("24252627Y", new Cliente("24252627Y", "Raúl", "León", "644567333", "Avenida del Parque 13"));
        mapaClientes.put("25262728Z", new Cliente("25262728Z", "Elisa", "Paredes", "655678222", "Calle Nueva 11"));
        mapaClientes.put("26272829A", new Cliente("26272829A", "Roberto", "Correa", "666789111", "Plaza Mayor 2"));
        mapaClientes.put("27282930B", new Cliente("27282930B", "Gloria", "Cano", "677890000", "Paseo del Río 26"));
        mapaClientes.put("28293031C", new Cliente("28293031C", "Hugo", "Peña", "688901999", "Avenida de la Estación 8"));
        mapaClientes.put("29303132D", new Cliente("29303132D", "Andrea", "Silva", "699012888", "Calle Peatonal 17"));
    }
    // Métodos del repositorio
    public Cliente buscarCliente (String dni) throws Exception {
        Cliente cliente = mapaClientes.get(dni);
                if (cliente == null) {
                    throw new Exception("El cliente con dni " + dni + " no existe en el sistema");
                }
        return cliente;
    }

}

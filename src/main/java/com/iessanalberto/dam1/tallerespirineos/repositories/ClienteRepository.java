package com.iessanalberto.dam1.tallerespirineos.repositories;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteRepository {
    private ClienteRepository clienteRepository;
    private Map<String, Cliente> mapaClientes = new HashMap<>();
    private ClienteRepository(){

    }
    public ClienteRepository getInstance() {
        if (clienteRepository == null) {
            clienteRepository = new ClienteRepository();
                     
        }
        return clienteRepository;
    }
}

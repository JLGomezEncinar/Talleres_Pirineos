package com.iessanalberto.dam1.tallerespirineos.services;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import com.iessanalberto.dam1.tallerespirineos.repositories.ClienteRepository;

public class ClientService {
    private ClienteRepository clienteRepository = ClienteRepository.getInstance();
    public Cliente buscarCliente(String dni) throws Exception {
        return clienteRepository.buscarCliente(dni);
    }
}

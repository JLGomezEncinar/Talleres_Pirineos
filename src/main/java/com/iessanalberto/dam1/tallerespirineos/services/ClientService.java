package com.iessanalberto.dam1.tallerespirineos.services;

import com.iessanalberto.dam1.tallerespirineos.models.Cliente;
import com.iessanalberto.dam1.tallerespirineos.repositories.ClienteRepository;

public class ClientService {
    private ClienteRepository clienteRepository = ClienteRepository.getInstance();
    public Cliente buscarCliente(String dni) throws Exception {
        dni = dni.replace("-","");
        dni = dni.replace(" ","");
        dni = dni.toUpperCase();
        validar(dni);
        return clienteRepository.buscarCliente(dni);
    }

    private void validar(String dni) throws Exception{
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        // Transformamos los DNIs extranjeros
        if (dni.charAt(0) == 'X') {
            dni = "0" + dni.substring(1);
        } else if (dni.charAt(0) == 'Y') {
            dni = "1" + dni.substring(1);
        } else if (dni.charAt(0) == 'Z') {
            dni = "2" + dni.substring(1);
        }
        try {
            int numeroDni = Integer.parseInt(dni.substring(0,dni.length() - 1));
            if (dni.charAt(dni.length() - 1) != letrasDni.charAt(numeroDni%23)){
                throw new Exception("La letra del dni no es válida");
            }
        } catch (NumberFormatException exception){
            throw new Exception("El dni introducido no es válido");
        }
    }
}

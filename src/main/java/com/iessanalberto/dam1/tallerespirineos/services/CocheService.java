package com.iessanalberto.dam1.tallerespirineos.services;


import com.iessanalberto.dam1.tallerespirineos.models.Coche;

import com.iessanalberto.dam1.tallerespirineos.repositories.CocheRepository;

public class CocheService {
    private CocheRepository cocheRepository = CocheRepository.getInstance();

    public Coche buscarCoche(String matricula) throws Exception {
        matricula = matricula.replace("-","");
        matricula = matricula.replace(" ","");
        matricula = matricula.toUpperCase();
        return cocheRepository.buscarCoche(matricula);
    }
}


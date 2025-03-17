package com.iessanalberto.dam1.tallerespirineos.models;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;

    public Coche(String matricula, String marca, String modelo, int kilometros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometros() {
        return kilometros;
    }
}

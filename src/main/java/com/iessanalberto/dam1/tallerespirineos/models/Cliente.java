package com.iessanalberto.dam1.tallerespirineos.models;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    public Cliente(String dni, String nombre, String apellidos, String telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
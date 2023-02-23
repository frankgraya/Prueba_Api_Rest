package com.demo.java.model;

import java.io.Serializable;

public class PersonaDTO implements Serializable {
    private Long id;
    private String nombre;
    private int edad;
    private String direccion;
    private long telefono;
    private long codigoPostal;

    public PersonaDTO() {
    }


    public PersonaDTO(Long id, String nombre, int edad, String direccion, long telefono, long codigoPostal) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
    }

    public PersonaDTO(Long id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

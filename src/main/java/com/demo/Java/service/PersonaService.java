package com.demo.Java.service;

import com.demo.Java.model.Persona;

import java.util.List;

public interface PersonaService {

    public Persona savePersona(Persona persona);

    public void delete(long id);

    public Persona findById(long id);

    public List<Persona> findAll();
}

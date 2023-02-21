package com.demo.Java.service;

import com.demo.Java.model.Humano;

import java.util.List;

public interface HumanoService {
    public Humano crearHumano(Humano humano);

    public void borrarHumano(long id);

    public List<Humano> listarHumanos();

    public Humano buscarHumanoPorID(long id);

    public void ModificarHumano(Humano humano);

    public Humano login(String user, String password);

}

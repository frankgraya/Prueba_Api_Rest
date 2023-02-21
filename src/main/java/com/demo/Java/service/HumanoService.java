package com.demo.Java.service;

import com.demo.Java.model.Humano;
import com.demo.Java.repository.HumanoRepository;
import com.demo.Java.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanoService {

    @Autowired
    private HumanoRepository humanoRepository;
    public Humano crearHumano(Humano humano) {
        return humanoRepository.save(humano);
    }
    public void borrarHumano(Long id) {
        humanoRepository.deleteById(id);
    }
    public List<Humano> listarHumanos() {
        return humanoRepository.findAll();
    }
    public Humano buscarHumanoPorID(Long id) {
        return humanoRepository.findById(id).orElse(null);
    }
    public void ModificarHumano(Humano humano) {
        humanoRepository.save(humano);
    }
}

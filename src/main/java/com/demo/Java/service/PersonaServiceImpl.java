package com.demo.Java.service;


import com.demo.Java.model.Persona;
import com.demo.Java.repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public Persona savePersona(Persona persona) {
        log.info("Se guardo savePersona con exito ");
        return personaRepository.save(persona);
    }
    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
        log.info("Se borro con exito ");
    }
    @Override
    public Persona findById(long id) {
        Optional<Persona> optional = personaRepository.findById(id);
        Persona persona = null;
        if (optional.isPresent()) {
            persona = optional.get();
        } else {
            throw new RuntimeException(" persona no se encontro por id :: " + id);
        }

        log.info("Se busco persona con exito " + id);
        return persona;
    }
    @Override
    public List<Persona> findAll() {
        log.info("Se Busco todos las persona con exito ");
        return personaRepository.findAll();
    }


}

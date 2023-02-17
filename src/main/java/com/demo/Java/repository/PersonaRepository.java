package com.demo.Java.repository;

import com.demo.Java.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Persona findTopByOrderByIdDesc();
}


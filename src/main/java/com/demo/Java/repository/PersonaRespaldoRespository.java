package com.demo.Java.repository;

import com.demo.Java.model.RespaldoPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRespaldoRespository extends JpaRepository<RespaldoPersona, Long> {
}

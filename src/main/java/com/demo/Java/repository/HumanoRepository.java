package com.demo.Java.repository;

import com.demo.Java.model.Humano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Uso de query methods
@Repository
public interface HumanoRepository extends JpaRepository<Humano, Long> {
    public Humano findByUserAndPassword(String user, String password);
}

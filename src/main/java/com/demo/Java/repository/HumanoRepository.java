package com.demo.Java.repository;

import com.demo.Java.model.Humano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanoRepository extends JpaRepository<Humano,Long> {
}

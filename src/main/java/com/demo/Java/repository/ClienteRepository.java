package com.demo.Java.repository;

import com.demo.Java.model.Cliente;
import com.mysql.cj.xdevapi.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByapellido(String apellido);

}

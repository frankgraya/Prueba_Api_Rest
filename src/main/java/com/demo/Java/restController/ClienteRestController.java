package com.demo.Java.restController;


import com.demo.Java.model.Cliente;
import com.demo.Java.repository.ClienteRepository;
import com.demo.Java.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
@RestController
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAllClientes();
    }


}

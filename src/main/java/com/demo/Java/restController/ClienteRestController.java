package com.demo.Java.restController;


import com.demo.Java.model.Cliente;
import com.demo.Java.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//seguridad en la apio
@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins = {"http://localhost:4200"})
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

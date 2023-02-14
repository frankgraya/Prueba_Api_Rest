package com.demo.Java.restController;

import com.demo.Java.model.Prueba;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4000")
@RestController
@RequestMapping("/api")
public class PruebaRestController {

    @GetMapping("/Prueba")
    public Prueba getPrueba() {
        return new Prueba(1, "francisco", "granados");
    }

    @GetMapping("/Pruebas")
    public List<Prueba> obtentenPrueba() {
        List<Prueba> Pruebas = new ArrayList<>();
        Pruebas.add(new Prueba(1, "francisco", "granados"));
        Pruebas.add(new Prueba(2, "tere", "yañez"));
        Pruebas.add(new Prueba(3, "josefina", "somera"));
        return Pruebas;
    }
    @GetMapping("{nombre}/{apellido}")
    public Prueba PruebaPathVariable(String nombre, String apellido) {
        return new Prueba(nombre, apellido);
    }
}

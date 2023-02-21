package com.demo.Java.restController;

import com.demo.Java.model.Humano;
import com.demo.Java.service.HumanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HumanoRestController {
    @Autowired
    private HumanoService humanoService;
    //Create
    @PostMapping("/humanos")
    @ResponseBody
    public Humano crearHumano(@RequestBody Humano humano) {
        return humanoService.crearHumano(humano);
    }
    //Read
    @GetMapping("/humanos")
    @ResponseBody
    public List<Humano> listarHumano() {
        return humanoService.listarHumanos();
    }
    //Update
    @PutMapping("/humano")
    public void modificarHumano(@RequestBody Humano humano) {
        humanoService.ModificarHumano(humano);
    }
    //Delete
    @DeleteMapping("/humano/{id}")
    public void borrarHumano(@PathVariable Long id) {
        humanoService.borrarHumano(id);
    }
    @GetMapping("/humano/{id}")
    @ResponseBody
    public Humano buscarHumanoPorId(@PathVariable Long id) {
        return humanoService.buscarHumanoPorID(id);
    }


}

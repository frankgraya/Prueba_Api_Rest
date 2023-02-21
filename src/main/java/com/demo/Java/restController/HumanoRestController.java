package com.demo.Java.restController;

import com.demo.Java.model.Humano;
import com.demo.Java.service.HumanoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class HumanoRestController {
    @Autowired
    private HumanoService humanoService;

    //Create
    @PostMapping("/humano")
    @ResponseBody
    public Humano crearHumano(@RequestBody Humano humano) {
        log.info("Se crearHumano Controller con exito ");
        return humanoService.crearHumano(humano);
    }

    //Read
    @GetMapping("/humano")
    @ResponseBody
    public List<Humano> listarHumano() {
        log.info("Se listarHumanos Controller con exito ");
        return humanoService.listarHumanos();
    }

    //Update
    @PutMapping("/humano")
    public void modificarHumano(@RequestBody Humano humano) {
        log.info("Se ModificarHumano Controller con exito ");
        humanoService.ModificarHumano(humano);
    }

    //Delete
    @DeleteMapping("/humano/{id}")
    public void borrarHumano(@PathVariable Long id) {
        log.info("Se borrarHumano Controller con exito ");
        humanoService.borrarHumano(id);
    }

    @GetMapping("/humano/{id}")
    @ResponseBody
    public Humano buscarHumanoPorId(@PathVariable Long id) {
        log.info("Se buscarHumanoPorID con exito ");
        return humanoService.buscarHumanoPorID(id);
    }

    @PostMapping("/login")
    public Humano login(@RequestBody Humano humano) {
        return humanoService.login(humano.getPassword(), humano.getUser());
    }


}

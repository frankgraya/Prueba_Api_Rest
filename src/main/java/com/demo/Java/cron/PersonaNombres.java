package com.demo.Java.cron;

import com.demo.Java.model.Cliente;
import com.demo.Java.model.Persona;
import com.demo.Java.repository.PersonaRepository;
import com.demo.Java.service.ClienteService;
import com.demo.Java.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonaNombres {
    @Autowired
    private ClienteService clienteService;

    @Scheduled(cron = "* * * * * *")
    public void scheduleTaskUsingCronExpression() {
        long now = System.currentTimeMillis() / 1000;
        personaSave();
        log.info("esto es un cron" + now);
    }

    public void personaSave() {
        Cliente cliente = new Cliente();
        cliente.setNombre("lizbet");
        cliente.setApellido("peres");
        cliente.setEmail("corre@gmail.com");
        cliente.setCreateAt("2019-28-22");
        clienteService.saveCliente(cliente);
        //clienteService.findTopByOrderByIdDesc();
        log.info("El ultimo es" );
    }

//https://crontab.cronhub.io/
}

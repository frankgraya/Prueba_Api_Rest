package com.demo.Java.cron;

import com.demo.Java.model.Persona;
import com.demo.Java.repository.PersonaRepository;
import com.demo.Java.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PersonaNombres {
    @Autowired
    private PersonaRepository personaRepository;


    @Autowired
    public PersonaService personaService;

    /*
    @Scheduled(cron = "* * * * * *")
    public void scheduleTaskUsingCronExpression() {
        long now = System.currentTimeMillis() / 1000;

        personaSave();
        log.info("esto es un cron" + now);
    }

    public void personaSave() {
        //Persona persona = new Persona();
       // persona.setNombre("lizbet");
       // persona.setApellido("apeliido");
      //  personaService.savePersona(persona);
        personaService.findTopByOrderByIdDesc();
        log.info("El ultimo es" );
    }
*/

}

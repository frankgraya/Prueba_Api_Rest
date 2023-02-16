package com.demo.Java.service;

import com.demo.Java.model.Cliente;
import com.demo.Java.repository.ClienteRepository;
import com.demo.Java.repository.PersonaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente saveCliente(Cliente cliente) {
        log.info("Se guardo correctamente cliente");
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(long id) {
        clienteRepository.deleteById(id);
        log.info("Se borro con exito el cliente");
    }

    @Override
    public Cliente FindByIdCliente(long id) {

        Optional<Cliente> optional = clienteRepository.findById(id);
        Cliente cliente = null;

        if (optional.isPresent()) {
            cliente = optional.get();
        } else {
            log.warn("El cliente no se encontro correctamente por el id");
            throw new RuntimeException("El cliente no se pudo encontrar por id");
        }
        log.info("El cliente se encontro correctamente por el id");
        return cliente;
    }

    @Override
    public List<Cliente> findAllClientes() {
        log.info("Se encontro todos los clientes con exito");
        return clienteRepository.findAll();
    }
}

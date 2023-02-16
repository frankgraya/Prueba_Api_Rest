package com.demo.Java.service;

import com.demo.Java.model.Cliente;

import java.util.List;

public interface ClienteService {

    public Cliente saveCliente(Cliente cliente);

    public void deleteCliente(long id);

    public Cliente FindByIdCliente(long id);

    public List<Cliente> findAllClientes();
}

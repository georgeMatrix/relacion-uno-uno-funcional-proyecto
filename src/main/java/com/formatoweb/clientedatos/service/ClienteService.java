package com.formatoweb.clientedatos.service;

import com.formatoweb.clientedatos.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> clientes();
    Cliente saveCliente(Cliente cliente);
}

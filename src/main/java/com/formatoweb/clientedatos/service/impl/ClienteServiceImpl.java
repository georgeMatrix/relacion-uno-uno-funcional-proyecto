package com.formatoweb.clientedatos.service.impl;

import com.formatoweb.clientedatos.entity.Cliente;
import com.formatoweb.clientedatos.repository.ClienteRepository;
import com.formatoweb.clientedatos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}

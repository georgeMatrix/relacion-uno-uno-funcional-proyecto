package com.formatoweb.clientedatos.service.impl;

import com.formatoweb.clientedatos.entity.Datos;
import com.formatoweb.clientedatos.repository.DatosRepository;
import com.formatoweb.clientedatos.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosServiceImpl implements DatosService {
    @Autowired
    private DatosRepository datosRepository;

    @Override
    public List<Datos> datos() {
        return datosRepository.findAll();
    }

    @Override
    public Datos datosSave(Datos datos) {
        return datosRepository.save(datos);
    }
}

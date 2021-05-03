package com.formatoweb.clientedatos.service;

import com.formatoweb.clientedatos.entity.Datos;

import java.util.List;

public interface DatosService {
    List<Datos> datos();
    Datos datosSave(Datos datos);
}

package com.formatoweb.clientedatos.controllers;

import com.formatoweb.clientedatos.entity.Datos;
import com.formatoweb.clientedatos.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DatosController {
    @Autowired
    private DatosService datosService;

    @GetMapping("/datos")
    public List<Datos> getDatos(){
        return datosService.datos();
    }

    @PostMapping("/datos")
    public Datos datosSave(@RequestBody Datos datos){
        return datosService.datosSave(datos);
    }
}

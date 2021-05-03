package com.formatoweb.clientedatos.repository;

import com.formatoweb.clientedatos.entity.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosRepository extends JpaRepository<Datos, Integer> {
}

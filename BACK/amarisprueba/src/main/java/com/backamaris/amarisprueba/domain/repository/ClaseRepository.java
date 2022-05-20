package com.backamaris.amarisprueba.domain.repository;

import com.backamaris.amarisprueba.domain.Clase;

import java.util.List;
import java.util.Optional;

public interface ClaseRepository {
    List<Clase> getAll();
    Optional<Clase> getClase(int id);
    Clase save (Clase clase);
    void delete(int id);
}

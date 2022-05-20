package com.backamaris.amarisprueba.domain.repository;

import com.backamaris.amarisprueba.domain.Modulo;

import java.util.List;
import java.util.Optional;

public interface ModuloRepository {
    List<Modulo> getAll();
    Optional<Modulo> getModulo(int id);
    Modulo save (Modulo modulo);
    void delete(int id);
}

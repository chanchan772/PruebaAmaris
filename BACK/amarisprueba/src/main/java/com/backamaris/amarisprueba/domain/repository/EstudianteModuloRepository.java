package com.backamaris.amarisprueba.domain.repository;

import com.backamaris.amarisprueba.domain.EstudianteModulo;

import java.util.List;
import java.util.Optional;

public interface EstudianteModuloRepository {
    List<EstudianteModulo> getAll();
    Optional<EstudianteModulo> getEstudianteModulo(int id);
    EstudianteModulo save (EstudianteModulo estudianteModulo);
    void delete(int id);
}

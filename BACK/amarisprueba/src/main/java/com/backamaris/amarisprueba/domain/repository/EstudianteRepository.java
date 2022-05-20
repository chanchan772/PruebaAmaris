package com.backamaris.amarisprueba.domain.repository;

import com.backamaris.amarisprueba.domain.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteRepository {
    List<Estudiante> getAll();
    Optional<Estudiante> getEstudiante(int id);
    Estudiante save (Estudiante estudiante);

    void delete(int id);

}

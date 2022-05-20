package com.backamaris.amarisprueba.domain.repository;

import com.backamaris.amarisprueba.domain.Licencia;

import java.util.List;
import java.util.Optional;

public interface LicenciaRepository {
    List<Licencia> getAll();
    Optional<Licencia> getLicencia(int id);
    Licencia save (Licencia licencia);
    void delete(int id);
}

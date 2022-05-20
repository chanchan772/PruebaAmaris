package com.backamaris.amarisprueba.domain.service;

import com.backamaris.amarisprueba.domain.Licencia;
import com.backamaris.amarisprueba.domain.repository.LicenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LicenciaService {
    @Autowired
    private LicenciaRepository licenciaRepository;

    public List<Licencia> getAll(){
        return licenciaRepository.getAll();
    }

    public Optional<Licencia> getLicencia(int id){
        return licenciaRepository.getLicencia(id);
    }

    public Licencia save (Licencia clase){
        return licenciaRepository.save(clase);
    }

    public void delete(int id){
        licenciaRepository.delete(id);
    }
}

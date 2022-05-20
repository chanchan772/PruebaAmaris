package com.backamaris.amarisprueba.domain.service;

import com.backamaris.amarisprueba.domain.Clase;
import com.backamaris.amarisprueba.domain.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaseService {
    @Autowired
    private ClaseRepository claseRepository;

    public List<Clase> getAll(){
        return claseRepository.getAll();
    }

    public Optional<Clase> getClase(int id){
        return claseRepository.getClase(id);
    }

    public Clase save (Clase clase){
        return claseRepository.save(clase);
    }

    public void delete(int id){
        claseRepository.delete(id);
    }
}

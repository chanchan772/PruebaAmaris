package com.backamaris.amarisprueba.domain.service;

import com.backamaris.amarisprueba.domain.EstudianteModulo;
import com.backamaris.amarisprueba.domain.repository.EstudianteModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteModuloService {
    @Autowired
    private EstudianteModuloRepository estudianteModuloRepository;

    public List<EstudianteModulo> getAll(){
        return estudianteModuloRepository.getAll();
    }

    public Optional<EstudianteModulo> getEstudianteModulo(int id){
        return estudianteModuloRepository.getEstudianteModulo(id);
    }

    public EstudianteModulo save (EstudianteModulo clase){
        return estudianteModuloRepository.save(clase);
    }

    public void delete(int id){
        estudianteModuloRepository.delete(id);
    }
}

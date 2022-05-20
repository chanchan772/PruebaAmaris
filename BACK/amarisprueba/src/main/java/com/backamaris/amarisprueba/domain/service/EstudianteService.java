package com.backamaris.amarisprueba.domain.service;

import com.backamaris.amarisprueba.domain.Estudiante;
import com.backamaris.amarisprueba.domain.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getAll(){
        return estudianteRepository.getAll();
    }

    public Optional<Estudiante> getEstudiante(int id){
        return estudianteRepository.getEstudiante(id);
    }

    public Estudiante save (Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public void delete(int id){
        estudianteRepository.delete(id);
    }

}

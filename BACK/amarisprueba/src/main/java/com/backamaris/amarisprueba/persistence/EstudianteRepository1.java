package com.backamaris.amarisprueba.persistence;



import com.backamaris.amarisprueba.domain.Estudiante;
import com.backamaris.amarisprueba.persistence.entity.Estudiante1;
import com.backamaris.amarisprueba.persistence.mapper.EstudianteMapper1;
import com.backamaris.amarisprueba.domain.repository.EstudianteRepository;
import com.backamaris.amarisprueba.persistence.crud.EstudianteCrudRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepository1 implements EstudianteRepository {
    @Autowired
    private EstudianteCrudRepository1 claseCrudRepository;
    @Autowired
    private EstudianteMapper1 mapper;

    public List<Estudiante> getAll(){

        List<Estudiante1> estudianteModulo= (List<Estudiante1>) claseCrudRepository.findAll();
        return mapper.toEstudiantes(estudianteModulo);
    }

    public Optional<Estudiante> getEstudiante(int id){
        return claseCrudRepository.findById(id).map(clase1-> mapper.toEstudiante1(clase1));
    }

    public Estudiante save (Estudiante estudianteModulo)
    {
        Estudiante1 estudianteModulo1 = mapper.toEstudiante(estudianteModulo);
        return mapper.toEstudiante1(claseCrudRepository.save(estudianteModulo1));
    }



    public void delete(int id){
        claseCrudRepository.deleteById(id);
    }
}

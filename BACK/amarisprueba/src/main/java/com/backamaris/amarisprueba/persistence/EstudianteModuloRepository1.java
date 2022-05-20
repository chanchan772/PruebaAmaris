package com.backamaris.amarisprueba.persistence;

import com.backamaris.amarisprueba.domain.EstudianteModulo;
import com.backamaris.amarisprueba.persistence.mapper.EstudianteModuloMapper1;
import com.backamaris.amarisprueba.domain.repository.EstudianteModuloRepository;
import com.backamaris.amarisprueba.persistence.crud.EstudianteModuloCrudRepository1;
import com.backamaris.amarisprueba.persistence.entity.EstudianteModulo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteModuloRepository1 implements EstudianteModuloRepository {
    @Autowired
    private EstudianteModuloCrudRepository1 estudianteModuloCrudRepository;
    @Autowired
    private EstudianteModuloMapper1 mapper;

    public List<EstudianteModulo> getAll(){

        List<EstudianteModulo1> estudianteModulo= (List<EstudianteModulo1>) estudianteModuloCrudRepository.findAll();
        return mapper.toEstudianteModulos(estudianteModulo);
    }

    public Optional<EstudianteModulo> getEstudianteModulo(int id){
        return estudianteModuloCrudRepository.findById(id).map(estudianteModulo1 ->  mapper.toEstudianteModulo1(estudianteModulo1));
    }

    public EstudianteModulo save (EstudianteModulo estudianteModulo)
    {
        EstudianteModulo1 estudianteModulo1 = mapper.toEstudianteModulo(estudianteModulo);
        return mapper.toEstudianteModulo1(estudianteModuloCrudRepository.save(estudianteModulo1));
    }

    public void delete(int id){
        estudianteModuloCrudRepository.deleteById(id);
    }
}

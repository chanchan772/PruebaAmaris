package com.backamaris.amarisprueba.persistence;


import com.backamaris.amarisprueba.domain.Clase;
import com.backamaris.amarisprueba.persistence.mapper.ClaseMapper1;
import com.backamaris.amarisprueba.domain.repository.ClaseRepository;
import com.backamaris.amarisprueba.persistence.crud.ClaseCrudRepository1;
import com.backamaris.amarisprueba.persistence.entity.Clase1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClaseRepository1 implements ClaseRepository {
    @Autowired
    private ClaseCrudRepository1 claseCrudRepository;
    @Autowired
    private ClaseMapper1 mapper;

    public List<Clase> getAll(){

        List<Clase1> estudianteModulo= (List<Clase1>) claseCrudRepository.findAll();
        return mapper.toClases(estudianteModulo);
    }

    public Optional<Clase> getClase(int id){
        return claseCrudRepository.findById(id).map(clase1-> mapper.toClase1(clase1));
    }

    public Clase save (Clase estudianteModulo)
    {
        Clase1 estudianteModulo1 = mapper.toClase(estudianteModulo);
        return mapper.toClase1(claseCrudRepository.save(estudianteModulo1));
    }

    public void delete(int id){
        claseCrudRepository.deleteById(id);
    }
}

package com.backamaris.amarisprueba.persistence;

import com.backamaris.amarisprueba.domain.Modulo;
import com.backamaris.amarisprueba.domain.repository.ModuloRepository;
import com.backamaris.amarisprueba.persistence.crud.ModuloCrudRepository1;
import com.backamaris.amarisprueba.persistence.entity.Modulo1;
import com.backamaris.amarisprueba.persistence.mapper.ModuloMapping1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ModuloRepository1 implements ModuloRepository {
    @Autowired
    private ModuloCrudRepository1 claseCrudRepository;
    @Autowired
    private ModuloMapping1 mapper;

    public List<Modulo> getAll(){

        List<Modulo1> estudianteModulo= (List<Modulo1>) claseCrudRepository.findAll();
        return mapper.toModulos(estudianteModulo);
    }

    public Optional<Modulo> getModulo(int id){
        return claseCrudRepository.findById(id).map(modulo1-> mapper.toModulo1(modulo1));
    }

    public Modulo save (Modulo estudianteModulo)
    {
        Modulo1 estudianteModulo1 = mapper.toModulo(estudianteModulo);
        return mapper.toModulo1(claseCrudRepository.save(estudianteModulo1));
    }



    public void delete(int id){
        claseCrudRepository.deleteById(id);
    }
}

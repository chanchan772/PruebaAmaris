package com.backamaris.amarisprueba.persistence;

import com.backamaris.amarisprueba.domain.Licencia;
import com.backamaris.amarisprueba.persistence.mapper.LicenciaMapper1;
import com.backamaris.amarisprueba.domain.repository.LicenciaRepository;
import com.backamaris.amarisprueba.persistence.crud.LicenciaCrudRepository1;
import com.backamaris.amarisprueba.persistence.entity.Licencia1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LicenciaRepository1 implements LicenciaRepository {
    @Autowired
    private LicenciaCrudRepository1 claseCrudRepository;
    @Autowired
    private LicenciaMapper1 mapper;

    public List<Licencia> getAll(){

        List<Licencia1> estudianteModulo= (List<Licencia1>) claseCrudRepository.findAll();
        return mapper.toLicencias(estudianteModulo);
    }

    public Optional<Licencia> getLicencia(int id){
        return claseCrudRepository.findById(id).map(licencia1-> mapper.toLicencia1(licencia1));
    }

    public Licencia save (Licencia estudianteModulo)
    {
        Licencia1 estudianteModulo1 = mapper.toLicencia(estudianteModulo);
        return mapper.toLicencia1(claseCrudRepository.save(estudianteModulo1));
    }



    public void delete(int id){
        claseCrudRepository.deleteById(id);
    }
}

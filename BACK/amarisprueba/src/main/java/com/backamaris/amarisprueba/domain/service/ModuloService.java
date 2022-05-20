package com.backamaris.amarisprueba.domain.service;

import com.backamaris.amarisprueba.domain.Modulo;
import com.backamaris.amarisprueba.domain.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Modulo")
public class ModuloService {
    @Autowired
    private ModuloRepository moduloRepository;

    public List<Modulo> getAll(){
        return moduloRepository.getAll();
    }

    public Optional<Modulo> getLicencia(int id){
        return moduloRepository.getModulo(id);
    }

    public Modulo save (Modulo clase){
        return moduloRepository.save(clase);
    }

    public void delete(int id){
        moduloRepository.delete(id);
    }
}

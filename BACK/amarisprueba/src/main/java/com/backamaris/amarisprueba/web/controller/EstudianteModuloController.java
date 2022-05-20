package com.backamaris.amarisprueba.web.controller;

import com.backamaris.amarisprueba.domain.EstudianteModulo;
import com.backamaris.amarisprueba.domain.service.EstudianteModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/EstudianteModulo")
public class EstudianteModuloController {
    @Autowired
    private EstudianteModuloService claseService;

    @GetMapping("/all")
    public List<EstudianteModulo> getAll() {
        return claseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<EstudianteModulo> getEstudiante(@PathVariable("id") int productId) {
        return claseService.getEstudianteModulo(productId);
    }



    @PostMapping("/save")
    public EstudianteModulo save(@RequestBody EstudianteModulo product) {
        return claseService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId) {
        claseService.delete(productId);
    }
}

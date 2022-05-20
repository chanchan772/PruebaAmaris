package com.backamaris.amarisprueba.web.controller;

import com.backamaris.amarisprueba.domain.Estudiante;
import com.backamaris.amarisprueba.domain.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiante")
public class EstudianeController {
    @Autowired
    private EstudianteService claseService;

    @GetMapping("/all")
    public List<Estudiante> getAll() {
        return claseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> getEstudiante(@PathVariable("id") int productId) {
        return claseService.getEstudiante(productId);
    }



    @PostMapping("/save")
    public Estudiante save(@RequestBody Estudiante product) {
        return claseService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId) {
        claseService.delete(productId);
    }
}

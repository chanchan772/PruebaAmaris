package com.backamaris.amarisprueba.web.controller;

import com.backamaris.amarisprueba.domain.Clase;
import com.backamaris.amarisprueba.domain.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Clase")
public class ClaseController {
    @Autowired
    private ClaseService claseService;

    @GetMapping("/all")
    public List<Clase> getAll() {
        return claseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Clase> getClase(@PathVariable("id") int productId) {
        return claseService.getClase(productId);
    }


    @PostMapping("/save")
    public Clase save(@RequestBody Clase product) {
        return claseService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId) {
        claseService.delete(productId);
    }
}

package com.backamaris.amarisprueba.web.controller;

import com.backamaris.amarisprueba.domain.Modulo;
import com.backamaris.amarisprueba.domain.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Modulo")
public class ModuloController {
    @Autowired
    private ModuloService claseService;

    @GetMapping("/all")
    public List<Modulo> getAll() {
        return claseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Modulo> getEstudiante(@PathVariable("id") int productId) {
        return claseService.getLicencia(productId);
    }



    @PostMapping("/save")
    public Modulo save(@RequestBody Modulo product) {
        return claseService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId) {
        claseService.delete(productId);
    }

}

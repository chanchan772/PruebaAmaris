package com.backamaris.amarisprueba.web.controller;

import com.backamaris.amarisprueba.domain.Licencia;
import com.backamaris.amarisprueba.domain.service.LicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Licencia")
public class LicenciaController {
    @Autowired
    private LicenciaService claseService;

    @GetMapping("/all")
    public List<Licencia> getAll() {
        return claseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Licencia> getEstudiante(@PathVariable("id") int productId) {
        return claseService.getLicencia(productId);
    }

    @PostMapping("/save")
    public Licencia save(@RequestBody Licencia product) {
        return claseService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int productId) {
        claseService.delete(productId);
    }
}

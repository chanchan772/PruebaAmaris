package com.backamaris.amarisprueba.domain;

import javax.persistence.Column;

public class Clase {
    private Integer id;
    private Integer idModulo;
    private String NombreClase;

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Integer idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombreClase() {
        return NombreClase;
    }

    public void setNombreClase(String nombreClase) {
        NombreClase = nombreClase;
    }
}

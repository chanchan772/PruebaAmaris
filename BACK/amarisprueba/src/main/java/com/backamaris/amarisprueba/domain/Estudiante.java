package com.backamaris.amarisprueba.domain;

import javax.persistence.Column;

public class Estudiante {
    private Integer id;
    private String Nombre;
    private String Cedula;
    private Integer Edad;
    private Integer idTipoLic;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getIdTipoLic() {
        return idTipoLic;
    }

    public void setIdTipoLic(Integer idTipoLic) {
        this.idTipoLic = idTipoLic;
    }
}

package com.backamaris.amarisprueba.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="Modulo")
public class Modulo1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="NombreModulo")
    private String NombreModulo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreModulo() {
        return NombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        NombreModulo = nombreModulo;
    }


}

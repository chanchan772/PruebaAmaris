package com.backamaris.amarisprueba.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name="Clases")
public class Clase1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="idModulo")
    private Integer idModulo;

    @Column(name="NombreClase")
    private String NombreClase;

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

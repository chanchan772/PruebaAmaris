package com.backamaris.amarisprueba.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="Estudiantes")
public class Estudiante1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="Nombre")
    private String Nombre;

    @Column(name="Cedula")
    private String Cedula;

    @Column(name="Edad")
    private Integer Edad;

    @Column(name="idTipoLic")
    private Integer idTipoLic;

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

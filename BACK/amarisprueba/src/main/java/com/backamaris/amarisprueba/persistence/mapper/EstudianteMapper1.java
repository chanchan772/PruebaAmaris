package com.backamaris.amarisprueba.persistence.mapper;

import com.backamaris.amarisprueba.domain.Estudiante;
import com.backamaris.amarisprueba.persistence.entity.Estudiante1;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstudianteMapper1 {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "cedula", target = "cedula"),
            @Mapping(source = "edad", target = "edad"),
            @Mapping(source = "idTipoLic", target = "idTipoLic")
    })
    Estudiante1 toEstudiante(Estudiante estudiante);
    List<Estudiante> toEstudiantes(List<Estudiante1> estudiante);
    @InheritInverseConfiguration
    Estudiante toEstudiante1(Estudiante1 estudiante);

}

package com.backamaris.amarisprueba.persistence.mapper;

import com.backamaris.amarisprueba.domain.EstudianteModulo;
import com.backamaris.amarisprueba.persistence.entity.EstudianteModulo1;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface EstudianteModuloMapper1 {


    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idModulo", target = "idModulo"),
            @Mapping(source = "idEstudiante", target = "idEstudiante"),
            @Mapping(source = "idActivo", target = "idActivo"),
            @Mapping(source = "idCalificacion", target = "idCalificacion")
    })
    EstudianteModulo1 toEstudianteModulo(EstudianteModulo estudianteModulo);
    List<EstudianteModulo> toEstudianteModulos(List<EstudianteModulo1> estudianteModulo);
    @InheritInverseConfiguration
    EstudianteModulo toEstudianteModulo1(EstudianteModulo1 estudianteModulo);
}

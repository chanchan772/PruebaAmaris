package com.backamaris.amarisprueba.persistence.mapper;

import com.backamaris.amarisprueba.domain.Clase;
import com.backamaris.amarisprueba.persistence.entity.Clase1;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClaseMapper1 {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idModulo", target = "idModulo"),
            @Mapping(source = "nombreClase", target = "nombreClase")
    })
    Clase1 toClase(Clase clase);
    List<Clase> toClases(List<Clase1> clase);

    @InheritInverseConfiguration
    Clase toClase1(Clase1 clase);
}

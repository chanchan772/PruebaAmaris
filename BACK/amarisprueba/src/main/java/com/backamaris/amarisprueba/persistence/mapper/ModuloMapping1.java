package com.backamaris.amarisprueba.persistence.mapper;

import com.backamaris.amarisprueba.domain.Modulo;
import com.backamaris.amarisprueba.persistence.entity.Modulo1;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ModuloMapping1 {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombreModulo", target = "nombreModulo")
    })
    Modulo1 toModulo(Modulo modulo);
    List<Modulo> toModulos(List<Modulo1>  modulo);
    @InheritInverseConfiguration
    Modulo toModulo1(Modulo1 modulo);

}

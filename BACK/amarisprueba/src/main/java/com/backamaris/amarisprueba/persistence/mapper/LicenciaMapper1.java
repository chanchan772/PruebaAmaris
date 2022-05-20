package com.backamaris.amarisprueba.persistence.mapper;

import com.backamaris.amarisprueba.domain.Licencia;
import com.backamaris.amarisprueba.persistence.entity.Licencia1;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LicenciaMapper1 {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "tipo", target = "tipo")
    })
    Licencia1 toLicencia(Licencia licencia);
    List<Licencia> toLicencias(List<Licencia1>  licencia);
    @InheritInverseConfiguration
    Licencia toLicencia1(Licencia1 licencia);
}

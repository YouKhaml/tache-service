package org.example.tacheservice.mapper;

import org.example.tacheservice.dto.TacheDTO;
import org.example.tacheservice.entites.Tache;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring")
public interface TacheMapper {
    Tache tacheDtoToTache(TacheDTO tacheDTO);
    TacheDTO tacheToTacheDTO(Tache tache);
}

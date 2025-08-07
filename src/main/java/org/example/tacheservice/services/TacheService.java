package org.example.tacheservice.services;

import org.example.tacheservice.dto.TacheDTO;

import java.util.List;

public interface TacheService {
   TacheDTO createTache(TacheDTO tacheDTO);
   List<TacheDTO> getAllTaches();
   TacheDTO getTacheById(String id);
   void deleteTacheById(String id);
   TacheDTO updateTache(String id, TacheDTO tacheDTO);

}

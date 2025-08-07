package org.example.tacheservice.services;

import lombok.RequiredArgsConstructor;
//import org.example.tacheservice.clients.UserClient;
import org.example.tacheservice.dto.TacheDTO;

//import org.example.tacheservice.dto.UserDTO;
import org.example.tacheservice.entites.Tache;
import org.example.tacheservice.mapper.TacheMapper;
import org.example.tacheservice.repositories.TacheRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TacheServiceImpl implements TacheService {
    private final TacheRepository tacheRepository;
    private final TacheMapper tacheMapper;
//    private final UserClient userClient;

    public TacheServiceImpl(TacheRepository tacheRepository, TacheMapper tacheMapper) {
        this.tacheRepository = tacheRepository;
        this.tacheMapper = tacheMapper;
//        this.userClient = userClient;
    }

    @Override
    public TacheDTO createTache(TacheDTO tacheDTO) {
//        UserDTO userDTO = userClient.getUser(tacheDTO.getUserUsername());
//        if (userDTO == null) throw new RuntimeException("User not found");
        Tache tache = tacheMapper.tacheDtoToTache(tacheDTO);
        Tache savedTache = tacheRepository.save(tache);

        return tacheMapper.tacheToTacheDTO(savedTache);
    }

    @Override
    public List<TacheDTO> getAllTaches() {
        return tacheRepository.findAll().stream().map(tacheMapper::tacheToTacheDTO).collect(Collectors.toList());
    }

    @Override
    public TacheDTO getTacheById(String id) {
       Tache tache = tacheRepository.findById(id).orElse(null);
       if (tache == null) throw new RuntimeException("Tache not found");
       return tacheMapper.tacheToTacheDTO(tache);
    }

    @Override
    public void deleteTacheById(String id) {
        tacheRepository.deleteById(id);
    }

    @Override
    public TacheDTO updateTache(String id, TacheDTO tacheDTO) {
        return tacheRepository.findById(id)
                .map(existingTache->{

                    if(tacheDTO.getTitre() != null && !tacheDTO.getTitre().isBlank()){
                        existingTache.setTitre(tacheDTO.getTitre());
                    }
                    if(tacheDTO.getDescription() != null && !tacheDTO.getDescription().isBlank()){
                        existingTache.setDescription(tacheDTO.getDescription());
                    }
                    if(tacheDTO.getDateDebut() != null ){
                        existingTache.setDateDebut(tacheDTO.getDateDebut());
                    }
                    if(tacheDTO.getDateFin() != null ){
                        existingTache.setDateFin(tacheDTO.getDateFin());
                    }
                    if(tacheDTO.getPriorite() != null){
                        existingTache.setPriorite(tacheDTO.getPriorite());
                    }
                    if(tacheDTO.getStatut() != null){
                        existingTache.setStatut(tacheDTO.getStatut());
                    }
                    if(tacheDTO.getCategorie() != null && !tacheDTO.getCategorie().isBlank()){
                        existingTache.setCategorie(tacheDTO.getCategorie());
                    }

                    existingTache.setNiveauUrgence(tacheDTO.getNiveauUrgence());
                    existingTache.setTerminee(tacheDTO.isTerminee());
                    existingTache.setDateDerniereModification(LocalDateTime.now());
                    return tacheMapper.tacheToTacheDTO(tacheRepository.save(existingTache));

                })
                .orElseThrow(() -> new RuntimeException("Tâche avec ID " + id + " non trouvée"));


    }


}

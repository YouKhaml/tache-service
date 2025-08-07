package org.example.tacheservice.controllers;

import org.example.tacheservice.dto.TacheDTO;
import org.example.tacheservice.services.TacheService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tache")
public class TacheController {
    private TacheService tacheService;

    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }

    @PostMapping("/createTache")
    ResponseEntity<TacheDTO> createTache (@RequestBody TacheDTO tacheDTO){
        tacheService.createTache(tacheDTO);
        return ResponseEntity.ok().body(tacheDTO);
    }

    @GetMapping("/taches")
    ResponseEntity<List<TacheDTO>> getAllTache(){
       List<TacheDTO> taches = tacheService.getAllTaches();
        if(taches.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(taches);
    }

    @GetMapping("/tache/{id}")
    ResponseEntity<TacheDTO> getTacheById(@PathVariable String id){
        TacheDTO tacheDTO = tacheService.getTacheById(id);
        if(tacheDTO == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(tacheDTO);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Void> deleteTache(@PathVariable String id){
        tacheService.deleteTacheById(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/update_tache/{id}")
    ResponseEntity<TacheDTO> UpdateTache(@PathVariable String id, @RequestBody TacheDTO tacheDTO){
        TacheDTO tache = tacheService.updateTache(id, tacheDTO);

        if (tache == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(tache);
    }







}

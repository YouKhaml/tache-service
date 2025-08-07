package org.example.tacheservice.repositories;

import org.example.tacheservice.entites.Tache;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TacheRepository extends MongoRepository<Tache, String> {
}

package fr.chakib.formation.spring.localibback.Voiture;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface VoitureRepository extends MongoRepository<Voiture, String> {
}

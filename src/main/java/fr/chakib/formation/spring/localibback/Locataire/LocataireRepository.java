package fr.chakib.formation.spring.localibback.Locataire;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface LocataireRepository extends MongoRepository<Locataire, String> {
}
package fr.chakib.formation.spring.localibback.Location;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface LocationRepository extends MongoRepository<Location, String> {
}
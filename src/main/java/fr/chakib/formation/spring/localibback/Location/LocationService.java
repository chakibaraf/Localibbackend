package fr.chakib.formation.spring.localibback.Location;

import java.util.List;


public interface LocationService {
    List<Location> findAll();

    Location save(Location entity);

    Location findById(String id);

    void deleteById(String id);
}

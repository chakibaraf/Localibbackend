package fr.chakib.formation.spring.localibback.Location;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


public class LocationImplementation implements LocationService{

    /**
     *logger pour gerer les messages emis par l'applicqtion durant l'explication
     */
    private static final Logger logger = LoggerFactory.getLogger(LocationImplementation.class);

    private final LocationRepository locationRepository;

    public LocationImplementation(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }



    @Override
    public Location  save(Location entity) {
        return locationRepository.save(entity);
    }



    @Override
    public Location findById(String id) {
        return locationRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });

    }



    @Override
    public void deleteById(String id) {
        locationRepository.deleteById(id);
    }
}
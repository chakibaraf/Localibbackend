package fr.chakib.formation.spring.localibback.Locataire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


public class LocataireImplementation implements LocataireService {

    /**
     *logger pour gerer les messages emis par l'applicqtion durant l'explication
     */

    private static final Logger logger = LoggerFactory.getLogger(LocataireImplementation.class);
    private final LocataireRepository locataireRepository;

    /**
     *
     */

    public LocataireImplementation(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }

    /**
     *
     */

    @Override
    public List<Locataire> findAll() {
        return locataireRepository.findAll();
    }

    @Override
    public Locataire findById(String id) {
        return locataireRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }



    @Override
    public Locataire  save(Locataire entity) {
        return locataireRepository.save(entity);
    }



    @Override
    public void deleteById(String id) {
        locataireRepository.deleteById(id);
    }
}

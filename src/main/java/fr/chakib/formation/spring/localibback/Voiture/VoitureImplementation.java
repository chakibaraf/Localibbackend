package fr.chakib.formation.spring.localibback.Voiture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


public class VoitureImplementation implements VoitureService{


    /**
     *logger pour gerer les messages emis par l'applicqtion durant l'explication
     */
    private static final Logger logger = LoggerFactory.getLogger(VoitureImplementation.class);
    private final VoitureRepository voitureRepository;

    public VoitureImplementation(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    @Override
    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }


    @Override
    public Voiture  save(Voiture entity) {
        return voitureRepository.save(entity);
    }


    @Override
    public Voiture findById(String id) {
        return voitureRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }


    @Override
    public void deleteById(String id) {
        voitureRepository.deleteById(id);
    }
}

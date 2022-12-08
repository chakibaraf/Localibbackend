package fr.chakib.formation.spring.localibback.Voiture;

import java.util.List;


public interface VoitureService {

    List<Voiture> findAll();

    Voiture save(Voiture entity);

    Voiture findById(String id);

    void deleteById(String id);
}

package fr.chakib.formation.spring.localibback.Locataire;

import java.util.List;


public interface LocataireService {


    /**
     Recherche de tous les  locataires
     * **/
    List<Locataire> findAll();

    /**
     * Sauvegarde  locataire
     * @return entity etat de sauvegarde
     */
    Locataire save(Locataire entity);

    /**
     * Renvois   locataire en fonction de son id
     *  status 404
     * @param id
     *
     */
    Locataire findById(String id);


    /**
     * Suppression du locataire en fonction de id
     * @param id du locataire  supprimer
     */
    void deleteById(String id);
}
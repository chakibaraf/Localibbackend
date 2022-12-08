package fr.chakib.formation.spring.localibback.Location;

import fr.chakib.formation.spring.localibback.Locataire.Locataire;
import fr.chakib.formation.spring.localibback.Voiture.Voiture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    private String id;
    private LocalDate dateDepart;
    private LocalDate dateFin;
    private Long prixLocation;

    @DBRef
    private Locataire locataire;

    @DBRef
    private Voiture voiture;
}
package fr.chakib.formation.spring.localibback.Voiture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    private String id;
    private String marque;
    private String plaqueImmatriculation;
    private String model;
    private Long prix;
    private VoitureDisponible Vdisponible;
}

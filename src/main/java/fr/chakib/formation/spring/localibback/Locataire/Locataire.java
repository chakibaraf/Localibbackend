package fr.chakib.formation.spring.localibback.Locataire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Locataire {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String numerosTelephone;


}
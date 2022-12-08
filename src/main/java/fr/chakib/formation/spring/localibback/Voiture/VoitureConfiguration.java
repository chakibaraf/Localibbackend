package fr.chakib.formation.spring.localibback.Voiture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoitureConfiguration {
    @Bean
    public VoitureService voitureService(VoitureRepository voitureRepository) {
        return new VoitureImplementation(voitureRepository);
    }
}
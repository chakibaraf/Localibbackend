package fr.chakib.formation.spring.localibback.Location;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LocationConfiguration {
    @Bean
    public LocationService locationService(LocationRepository locationRepository) {
        return new LocationImplementation(locationRepository);
    }
}
package com.example.test;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonneConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(PersonneRepository personneRepository){
        return args -> {
            Personne tom = new Personne("Kisiela", "Tom", LocalDate.of(1997, 03, 06));
            Personne test = new Personne("Nom", "Prenom", LocalDate.of(1997, 03, 07));
            personneRepository.saveAll(List.of(tom, test));
        };
    }
}

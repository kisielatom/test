package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;

    @Autowired
    public PersonneService(PersonneRepository personneRepository){
        this.personneRepository = personneRepository;
    }

    public List<Personne> getPersonnes(){
         return personneRepository.findAll(Sort.by(Sort.Direction.ASC, "nom"));
    }

    public void addNewPersonne(Personne personne){
        if (personne.getAge() > 150) {
            throw new IllegalStateException("too old");
        }
        personneRepository.save(personne);
    }
}

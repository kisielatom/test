package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/personne")
public class PersonneController {

    private final PersonneService personneService;

    @Autowired
    public PersonneController(PersonneService personneService){
        this.personneService = personneService;
    }

    @GetMapping
    public List<Personne> getPersonnes(){
        return personneService.getPersonnes();
    }

    @PostMapping
    public void registerNewPersonne(@RequestBody Personne personne){
        personneService.addNewPersonne(personne);
    }
    
}

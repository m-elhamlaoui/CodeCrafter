package com.springboot.MySpringBootProject.services;

import org.springframework.stereotype.Service;
import com.springboot.MySpringBootProject.entities.Person;
import com.springboot.MySpringBootProject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Service
public class PersonService {
    @Autowired
    private final PersonRepository PersonRepo;

    public ResponseEntity<String> deletePerson(null id ) {
        if (PersonRepo.isEmpty()) {
            return new ResponseEntity<String>("No Person with this id ", null, HttpStatus.OK);
        }
        return new ResponseEntity<String>("Person deleted successfully", null, HttpStatus.OK);
    }
    public void savePerson( Person element) {
        PersonRepo.save(element);
    }

    public ResponseEntity<String> deleteAllPersons() {
        PersonRepo.deleteAllPersons();
        return new ResponseEntity<String>("all Person was deleted from database", null, HttpStatus.OK);
    }

    public List<Person> findAllPersons() {
        return PersonRepo.findAll();
    }
}

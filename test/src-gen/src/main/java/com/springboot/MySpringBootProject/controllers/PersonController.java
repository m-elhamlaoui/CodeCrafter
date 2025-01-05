package com.springboot.MySpringBootProject.controllers;

import org.springframework.stereotype.Service;
import com.springboot.MySpringBootProject.entities.Person;
import com.springboot.MySpringBootProject.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.*;

@RestController
@RequestMapping("/api/Person ")
public class PersonController {
    @Autowired
    private final PersonService personService;

    @DeleteMapping("/deletePersonById")
    public ResponseEntity<String> deletePerson(null id ) {
        return PersonRepository.deleteById(id);
    }
    @PostMapping("savePerson")
    public ResponseEntity<String> savePerson(@RequestBody Person element) {
        return PersonService.save(element);
    }

    @GetMapping("/deleteAll")
    public ResponseEntity<String> deleteAllPersons() {
        return personService.deleteAllPersons();
    }
    @GetMapping("/findAll")
    public List<Person> findAllPersons() {
        return personService.findAllPersons();
    }

package com.springboot.MySpringBootProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "Person")
@Builder
public class Person {
    @Id
    private null id;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;

    public null getId() {
        return id;
    }

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getNom() {
        return nom;
    }

    public void setNom(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom) {
        this.nom = nom;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
}

package com.springboot.MySpringBootProject.DTO;
import lombok.*;
import java.util.*;

@Builder
public class PersonDTO {
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@160a4727 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@1d9fd69c (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@160a4727 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getNom() {
        return nom;
    }

    public void setNom(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@160a4727 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom) {
        this.nom = nom;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@1d9fd69c (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@1d9fd69c (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
}

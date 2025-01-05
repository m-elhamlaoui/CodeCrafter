package com.springboot.MySpringBootProject.DTO;
import lombok.*;
import java.util.*;

@Builder
public class PersonDTO {
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5c34e9f7 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) n;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@24b04e87 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5c34e9f7 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getN() {
        return n;
    }

    public void setN(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5c34e9f7 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) n) {
        this.n = n;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@24b04e87 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@24b04e87 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
}

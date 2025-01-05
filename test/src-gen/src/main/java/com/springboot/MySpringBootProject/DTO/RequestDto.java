package com.springboot.MySpringBootProject.DTO;
import lombok.*;
import java.util.*;

@Builder
public class RequestDto {
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6bfb0fdc (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@67ed9348 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;
    private List<org.xtext.example.springgen.springgen.impl.ValueTypesImpl@471f2e5 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null)> childs;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5dad1066 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) idCardNum;

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6bfb0fdc (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getNom() {
        return nom;
    }

    public void setNom(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6bfb0fdc (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom) {
        this.nom = nom;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@67ed9348 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@67ed9348 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
    public List<org.xtext.example.springgen.springgen.impl.ValueTypesImpl@471f2e5 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null)> getChilds() {
        return childs;
    }

    public void setChilds(List<org.xtext.example.springgen.springgen.impl.ValueTypesImpl@471f2e5 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null)> childs) {
        this.childs = childs;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5dad1066 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5dad1066 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) idCardNum) {
        this.idCardNum = idCardNum;
    }
}

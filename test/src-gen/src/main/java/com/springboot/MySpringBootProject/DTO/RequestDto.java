package com.springboot.MySpringBootProject.DTO;
import lombok.*;
import java.util.*;

@Builder
public class RequestDto {
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5e0152b0 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@73e05468 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;
    private List<org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6015b1b6 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null)> childs;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@3ef50378 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) idCardNum;

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5e0152b0 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getNom() {
        return nom;
    }

    public void setNom(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@5e0152b0 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom) {
        this.nom = nom;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@73e05468 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@73e05468 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
    public List<org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6015b1b6 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null)> getChilds() {
        return childs;
    }

    public void setChilds(List<org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6015b1b6 (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null)> childs) {
        this.childs = childs;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@3ef50378 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@3ef50378 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) idCardNum) {
        this.idCardNum = idCardNum;
    }
}

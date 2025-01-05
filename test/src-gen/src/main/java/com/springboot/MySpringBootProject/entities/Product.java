package com.springboot.MySpringBootProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "Product")
@Builder
public class Product {
    @Id
    private null id;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@364d8221 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) productName;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@28e95466 (FLOAT: float, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) price;

    public null getId() {
        return id;
    }

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@364d8221 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getProductName() {
        return productName;
    }

    public void setProductName(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@364d8221 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) productName) {
        this.productName = productName;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@28e95466 (FLOAT: float, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getPrice() {
        return price;
    }

    public void setPrice(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@28e95466 (FLOAT: float, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) price) {
        this.price = price;
    }
}

package com.springboot.MySpringBootProject.DTO;
import lombok.*;
import java.util.*;

@Builder
public class ProductDTO {
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@7bf03396 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) productName;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6d8fe033 (FLOAT: float, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) price;

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@7bf03396 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getProductName() {
        return productName;
    }

    public void setProductName(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@7bf03396 (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) productName) {
        this.productName = productName;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6d8fe033 (FLOAT: float, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getPrice() {
        return price;
    }

    public void setPrice(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@6d8fe033 (FLOAT: float, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) price) {
        this.price = price;
    }
}

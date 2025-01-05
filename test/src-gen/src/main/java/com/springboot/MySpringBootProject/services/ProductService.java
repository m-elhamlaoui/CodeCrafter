package com.springboot.MySpringBootProject.services;

import org.springframework.stereotype.Service;
import com.springboot.MySpringBootProject.entities.Product;
import com.springboot.MySpringBootProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Service
public class ProductService {
    @Autowired
    private final ProductRepository ProductRepo;

    public ResponseEntity<String> deleteProduct(null id ) {
        if (ProductRepo.isEmpty()) {
            return new ResponseEntity<String>("No Product with this id ", null, HttpStatus.OK);
        }
        return new ResponseEntity<String>("Product deleted successfully", null, HttpStatus.OK);
    }
    public void saveProduct( Product element) {
        ProductRepo.save(element);
    }

    public ResponseEntity<String> deleteAllProducts() {
        ProductRepo.deleteAllProducts();
        return new ResponseEntity<String>("all Product was deleted from database", null, HttpStatus.OK);
    }

    public List<Product> findAllProducts() {
        return ProductRepo.findAll();
    }
}

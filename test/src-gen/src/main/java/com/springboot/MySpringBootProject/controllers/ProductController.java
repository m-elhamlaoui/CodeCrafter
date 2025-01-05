package com.springboot.MySpringBootProject.controllers;

import org.springframework.stereotype.Service;
import com.springboot.MySpringBootProject.entities.Product;
import com.springboot.MySpringBootProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.*;

@RestController
@RequestMapping("/api/Product ")
public class ProductController {
    @Autowired
    private final ProductService productService;

    @DeleteMapping("/deleteProductById")
    public ResponseEntity<String> deleteProduct(null id ) {
        return ProductRepository.deleteById(id);
    }
    @PostMapping("saveProduct")
    public ResponseEntity<String> saveProduct(@RequestBody Product element) {
        return ProductService.save(element);
    }

    @GetMapping("/deleteAll")
    public ResponseEntity<String> deleteAllProducts() {
        return productService.deleteAllProducts();
    }
    @GetMapping("/findAll")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

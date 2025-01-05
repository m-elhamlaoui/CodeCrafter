package com.springboot.MySpringBootProject.repository;

import lombok.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.MySpringBootProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, null> {
    List<Product> findById(null id);
    List<Product> findByProductName(String productName);

    void deleteById(null id);

}

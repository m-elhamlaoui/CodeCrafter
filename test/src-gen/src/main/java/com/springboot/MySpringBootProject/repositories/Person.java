package com.springboot.MySpringBootProject.repository;

import lombok.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.MySpringBootProject.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, null> {
    List<Person> findById(null id);

    void deleteById(null id);

}

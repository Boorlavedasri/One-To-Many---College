package com.example.OneToManyCollege.Repository;

import com.example.OneToManyCollege.Model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.lang.model.element.Name;
import java.util.Optional;

public interface CollegeRepo extends JpaRepository<College, Integer> {


     static College findByname(String name) {
         return null;

     }
}



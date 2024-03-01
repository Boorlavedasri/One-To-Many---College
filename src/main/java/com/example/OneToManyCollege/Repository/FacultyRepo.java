package com.example.OneToManyCollege.Repository;

import com.example.OneToManyCollege.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FacultyRepo extends JpaRepository<Faculty, Integer> {

    List<Faculty> findByDepartmentName(String departmentName);
}
package com.example.OneToManyCollege.Repository;

import com.example.OneToManyCollege.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    List<Department> findByCollegeName(String collegeName);

}

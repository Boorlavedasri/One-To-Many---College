package com.example.OneToManyCollege.Service;

import com.example.OneToManyCollege.Model.Department;
import com.example.OneToManyCollege.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private final DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public Department addDepartment(Department department) {

        return departmentRepo.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    public Department getDepartmentById(int id) {
        Optional<Department> departmentOptional = departmentRepo.findById(id);
        return departmentOptional.orElse(null);
    }

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepo.findByCollegeName(collegeName);
    }

    public void assignFacultyToDepartment(int departmentId, int facultyId) {
        Optional<Department> departmentOptional = departmentRepo.findById(departmentId);
        if (departmentOptional.isPresent()) {
            Department department = departmentOptional.get();

        }
    }
}
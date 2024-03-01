package com.example.OneToManyCollege.Service;

import com.example.OneToManyCollege.Model.Faculty;
import com.example.OneToManyCollege.Repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class FacultyService {
    @Autowired
    private final FacultyRepo facultyRepo;


    public FacultyService(FacultyRepo facultyRepo) {
        this.facultyRepo= facultyRepo;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    public List<Faculty> getAllFaculties() {
        return facultyRepo.findAll();
    }

    public Faculty getFacultyById(int id) {
        Optional<Faculty> facultyOptional = facultyRepo.findById(id);
        return facultyOptional.orElse(null);
    }

    public List<Faculty> getFacultiesByDepartmentName(String departmentName) {
        return facultyRepo.findByDepartmentName(departmentName);
    }
}
package com.example.OneToManyCollege.Service;

import com.example.OneToManyCollege.Model.College;
import com.example.OneToManyCollege.Repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class CollegeService {
    @Autowired
    private final CollegeRepo collegeRepo;
    public CollegeService(CollegeRepo collegeRepo) {
        this.collegeRepo = collegeRepo;
    }
    public College addCollege(College college) {
        return collegeRepo.save(college);
    }

    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    public College getCollegeById(int id) {
        Optional<College> collegeOptional = collegeRepo.findById(id);
        return collegeOptional.orElse(null);
    }

    public  College getCollegeByName(String name) {
        return CollegeRepo.findByname(name);
    }

    public College updateCollegeName(int id,String name) {
        Optional<College> collegeOptional = collegeRepo.findById(id);
        if (collegeOptional.isPresent()) {
            College college = collegeOptional.get();
            college.setName(name);
            return collegeRepo.save(college);
        }
        return null;
    }

    public void deleteCollegeById(int id) {
        collegeRepo.deleteById(id);
    }
}
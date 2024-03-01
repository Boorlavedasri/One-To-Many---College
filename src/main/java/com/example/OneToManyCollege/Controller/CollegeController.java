package com.example.OneToManyCollege.Controller;

import com.example.OneToManyCollege.Model.College;
import com.example.OneToManyCollege.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private final CollegeService collegeService;
    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @PostMapping
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        College createdCollege = collegeService.addCollege(college);
        return new ResponseEntity<>(createdCollege, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<College>> getAllColleges() {
        List<College> colleges = collegeService.getAllColleges();
        return new ResponseEntity<>(colleges, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable int id) {
        College college = collegeService.getCollegeById(id);
        return new ResponseEntity<>(college, HttpStatus.OK);

    }
    @GetMapping("/name/{name}")
    public ResponseEntity<College> getCollegeByName(@PathVariable String name) {
        College college = collegeService.getCollegeByName(name);
        return new ResponseEntity<>(college, HttpStatus.OK);

    }

    @PutMapping("/{id}/update")
    public ResponseEntity<College> updateCollegeName(@PathVariable int id, @RequestBody String newName) {
        College updatedCollege = collegeService.updateCollegeName(id, College.getName);
            return new ResponseEntity<>(updatedCollege, HttpStatus.OK);

    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Void> deleteCollegeById(@PathVariable int id) {
        collegeService.deleteCollegeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}




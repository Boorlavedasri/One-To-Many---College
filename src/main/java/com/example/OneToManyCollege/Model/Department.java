package com.example.OneToManyCollege.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Department")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(name="Department")
    @NotNull(message = "Department cannot be null")
    private String department;

    @ManyToOne
    @JoinColumn(name = "college_id" ,nullable = false)
    private College college;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Faculty> faculties=new ArrayList<>();

}

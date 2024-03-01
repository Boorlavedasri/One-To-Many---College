package com.example.OneToManyCollege.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "faculty")

public class Faculty {
    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String name;
    @ManyToOne()
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

}

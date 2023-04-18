package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends Personne {
    @Column(nullable = false, length = 10)
    private String matricule;
}

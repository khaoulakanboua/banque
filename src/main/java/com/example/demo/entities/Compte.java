package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "comptes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Long numeroCompte;

    @Column(nullable = false)
    private double solde;

    @OneToMany(mappedBy = "id.compte", fetch = FetchType.EAGER)
    private List<Operation> operations;
}


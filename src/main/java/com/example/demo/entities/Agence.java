package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "agences")
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int code;

    @Column(nullable = false, length = 100)
    private String adresse;

    @OneToMany(mappedBy = "agence", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Compte> comptes;

    @ManyToOne
    @JsonIgnore
    private Ville ville;
}
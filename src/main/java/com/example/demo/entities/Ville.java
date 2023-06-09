package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



	@Entity
	@Table(name = "villes")
	public class Ville {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(nullable = false)
	    private int code;

	    @Column(nullable = false, length = 50)
	    private String nom;

	    @OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<Agence> agences;
	}


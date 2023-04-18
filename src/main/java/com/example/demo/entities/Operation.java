package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
    @EmbeddedId
    protected PrimaryKey id;

    @Column(nullable = false)
    protected String Nature;

    @Column(nullable = false, unique = true)
    protected Long numero;

    @Column(nullable = false)
    protected double montant;

    @Embeddable
    public static class PrimaryKey implements Serializable {
        private String code;
        @ManyToOne
        private Personne personne;
        @ManyToOne
        private Compte compte;
    }
}
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Integer>{

}

package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Compte;
import com.example.demo.idao.IDao;
import com.example.demo.repository.CompteRepository;

public class CompteService implements IDao<Compte>{

	@Autowired
	CompteRepository compteRepository;
	
	@Override
	public Compte create(Compte object) {
		if (Objects.isNull(object)) return null;
        return this.compteRepository.save(object);
	}

	@Override
	public void delete(Compte object) {
		compteRepository.delete(object);
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}

}

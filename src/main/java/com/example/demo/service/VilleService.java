package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Ville;
import com.example.demo.idao.IDao;
import com.example.demo.repository.VilleRepository;

public class VilleService implements IDao<Ville>{

	@Autowired
	VilleRepository villeRepository;
	
	@Override
	public Ville create(Ville object) {
		if (Objects.isNull(object)) return null;
        return this.villeRepository.save(object);
	}

	@Override
	public void delete(Ville object) {
		villeRepository.delete(object);
	}

	@Override
	public List<Ville> findAll() {
		// TODO Auto-generated method stub
		return villeRepository.findAll();
	}

}

package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.idao.IDao;
import com.example.demo.repository.ClientRepository;




@Service
public class ClientService implements IDao<Client>{

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client create(Client object) {
		// TODO Auto-generated method stub
		if (Objects.isNull(object)) return null;
        return this.clientRepository.save(object);
	}

	@Override
	public void delete(Client object) {
		clientRepository.delete(object);
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

}

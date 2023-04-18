package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Operation;
import com.example.demo.idao.IDao;
import com.example.demo.repository.OperationRepository;

public class OperationService implements IDao<Operation>{

	 @Autowired
	 OperationRepository operationRepository;
	@Override
	public Operation create(Operation object) {
		 if (Objects.isNull(object)) return null;
	        return this.operationRepository.save(object);
	}

	@Override
	public void delete(Operation object) {
		// TODO Auto-generated method stub
		operationRepository.delete(object);
	}

	@Override
	public List<Operation> findAll() {
		// TODO Auto-generated method stub
		return operationRepository.findAll();
	}

}

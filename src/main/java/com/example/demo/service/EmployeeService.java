package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Employee;
import com.example.demo.idao.IDao;
import com.example.demo.repository.EmployeeRepository;

public class EmployeeService implements IDao<Employee>{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee create(Employee object) {
		if (Objects.isNull(object)) return null;
        return this.employeeRepository.save(object);
	}

	@Override
	public void delete(Employee object) {
		employeeRepository.delete(object);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}

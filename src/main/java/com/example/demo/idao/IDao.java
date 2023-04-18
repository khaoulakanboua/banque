package com.example.demo.idao;

import java.util.List;

public interface IDao <T>{
	    T create(T object);

	    void delete(T object);

	    List<T> findAll();
	}



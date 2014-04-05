package com.koitoer.springangular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitoer.springangular.repository.EmployeeRepository;


@Service
public class MyService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public String serviceLayer(){
		System.out.println("Service layer is working");
		return  employeeRepository.findOne(1).toString();
	}
}

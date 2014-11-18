package com.koitoer.springangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.koitoer.springangular.model.Employee;

@RepositoryRestResource(path = "employees", collectionResourceRel = "employees",
		itemResourceRel = "employees/{id}")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

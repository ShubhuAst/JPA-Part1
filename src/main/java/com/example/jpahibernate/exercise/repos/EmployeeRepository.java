package com.example.jpahibernate.exercise.repos;

import com.example.jpahibernate.exercise.pojo.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}

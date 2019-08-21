package com.example.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.demo.entity.Employee;
/**
 * @author Murugeswaran
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

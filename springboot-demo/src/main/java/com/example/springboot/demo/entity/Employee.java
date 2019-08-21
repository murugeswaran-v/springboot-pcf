package com.example.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.DynamicUpdate;

/**
 * @author Murugeswaran
 *
 */
@Entity
public class Employee {
	// Employee ID auto generated
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	//First name of employee
	@Column(name = "first_name")
	@NotEmpty(message = "First name must not be empty")
	private String firstName;
	
	//last name of employee
	@Column(name = "last_name")
	@NotEmpty(message = "Last name must not be empty")
	private String lastName;
	
	//last name of employee
	@Column(name = "email")
	@NotEmpty(message = "Email must not be empty")
	@Email(message = "Email must be a valid email address")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
}

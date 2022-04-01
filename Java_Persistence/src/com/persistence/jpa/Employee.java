package com.persistence.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/*
 * Creation of an employee JPA entity class
 */
@Entity
public class Employee {
	
	//persistent field
	@Id
	private int id;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private float salary;
	@Transient
	private float cartTotal;
	
	// persistent property
	@Id @Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}

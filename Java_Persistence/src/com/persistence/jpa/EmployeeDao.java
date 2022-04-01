package com.persistence.jpa;

import java.lang.System.Logger.Level;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmployeeDao {
	@PersistenceContext
	private EntityManager em;

	public void addEmployee(Employee employee) {
		em.persist(employee);
	}
	
	public Employee findEmployee(int id) {
		Employee employee = em.find(Employee.class, id);
		return employee;
	}
	
	public void updateSalary(int id, float newSalary) {
		Employee employee = em.find(Employee.class, id);
		employee.setSalary(newSalary);
		em.merge(employee);
	}
	
	public void deleteEmployee(int id) {
		Employee employee = em.find(Employee.class, id);
		em.remove(employee);
	}

}

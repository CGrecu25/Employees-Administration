package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

/**
 * @author Cosmina Grecu
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}

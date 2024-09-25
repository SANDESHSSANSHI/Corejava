package com.sandesh.assignment01.utilities;

import com.sandesh.assignment01.employees.Employee;

public class EmployeeUtilities 
{
	
	 public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }

	    /**
	     * Gives a raise to the given employee by the specified percentage.
	     * 
	     * @param employee the employee to give a raise to
	     * @param percentage the percentage of the raise
	     */
	    public static void giveRaise(Employee employee, double percentage) {
	        double newSalary = employee.getSalary() * (1 + percentage / 100);
	        employee.setSalary(newSalary);
	    }
}

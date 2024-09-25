package com.sandesh.assignment01.employees; 

import com.sandesh.assignment01.employees.Developer;
import com.sandesh.assignment01.employees.Manager;
import com.sandesh.assignment01.utilities.EmployeeUtilities;

 
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
        manager.setName("Sandesh");
        manager.setEmployeeId("M001");
        manager.setSalary(90000);
        manager.setDepartment("Engineering");

        Developer developer = new Developer();
        developer.setName("Ronit");
        developer.setEmployeeId("D001");
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.print("\n");
        EmployeeUtilities.printEmployeeDetails(developer);

        EmployeeUtilities.giveRaise(manager, 10);
        EmployeeUtilities.giveRaise(developer, 5);

        System.out.println("\nAfter raise:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.print("\n");
        EmployeeUtilities.printEmployeeDetails(developer);
    }

}



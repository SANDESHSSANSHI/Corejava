/*Define a class Commission described as follows:
Data Members: Name, Address, Phone, Sales_amount 
Member methods:
(i) To accept details of the sales employee
(ii) to calculate the commission as follows: Sales_amount >= 100000, commission = 10%; 50000 <= Sales_amount < 100000, commission = 5%; 30000 <= Sales_amount < 50000, commission = 3%; Sales_amount < 30000, no commission.
Write the main method to create an object of a class and call the above member method.*/
package com.sandesh.assignment02;
import java.util.Scanner;

public class Commission {
	private String name,address,phone;
	private int sales_amount;
	private double commission;
	
	public void employee_details_entry()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name: ");
		name = sc.nextLine();
		System.out.println("Enter the Adress:");
		address = sc.nextLine();
		System.out.println("Enter the phone Number:");
		phone = sc.next();
		System.out.println("Enter the sales Amount:");
		sales_amount = sc.nextInt();	
	}
	
	public double calculate_commission()
	{
		if (sales_amount >= 100000) {
			commission = sales_amount + (sales_amount * 0.1);
		}
		else if (50000 <= sales_amount && sales_amount < 100000) {
			commission = sales_amount + (sales_amount * 0.05);
		}
		else if (30000 <= sales_amount && sales_amount < 50000) {
			commission = sales_amount + (sales_amount * 0.03);
		}
		else {
			commission = 0;
		}
		return commission;
	}

}

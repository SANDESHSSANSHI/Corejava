/*The Sky Airlines company wants to print a message based on the inputs given by the
customers. Help them by writing a Java application to get the customer's name,
source, and destination and print the message in the following format.
Note:
* In the Sample Input / Output provided, the highlighted text in bold
corresponds to the input given by the user, and the rest of the text represents
the output.
* Ensure to follow the object-oriented specifications provided in the question
description.
•
Trainer C2tc
7:10 PM

OUTPUT:
Dear Jack, welcome onboard with service from Dubai to Chicago. Thank you for
choosing Sky Airlines. Enjoy your flight.*/
package com.sandesh.assignment02;
import java.util.Scanner;


public class Airlines {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter customer name: \n");
		String name=ob.nextLine();
		
		System.out.println("Enter source: \n");
		String source=ob.nextLine();
		
		System.out.println("Enter destination: \n");
		String destination=ob.nextLine();
		
		System.out.println("Dear "+name+ " welcome onboard with service from "+source+" to "+destination+". Thank you for\r\n"
				+ "choosing Sky Airlines. Enjoy your flight");

	}
}

package com.company;

import java.util.Scanner;
import com.company.employee.Employee;

public class Driver {
	public static void main(String[] args) {
		
		String firstName, lastName;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Welcome to Company Administration! \n\nEnter your First name: ");
		firstName = sc.next();
		System.out.print("\nEnter your Last name: ");
		lastName = sc.next();
		
		// Instantiating employee class object with parameterized constructor
		Employee employee = new Employee(firstName, lastName);
		
		// calling credential method of Employee class to generate & show credentials
		employee.getCredentials();
						
		//Closing resources used sc
		sc.close();
		
		//Printing Exit line
		System.out.println("\nExiting the module\nHave a Great Day!");
						
	}

}

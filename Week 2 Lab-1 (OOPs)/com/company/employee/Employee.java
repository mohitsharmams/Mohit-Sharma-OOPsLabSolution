package com.company.employee;

import com.company.Credentials.Credentials;
import java.util.Scanner;

public class Employee {
	private String firstName, lastName, department;
	private int selection;
	int count;
	
	Scanner sc = new Scanner(System.in);
	
	//Parameterized constructor    
	public Employee(String firstName, String lastName){
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    }
	
	//Instantiating Credential class object    
	Credentials credentials = new Credentials();
	    	
	//Method to get credentials with setting the department name
	public void getCredentials() {
		
		// Creating Switch case condition which will run one times for Valid input 
		// and will run maximum of 2 times for invalid input
		do {									
			System.out.println(
					"\n------------------------------------\n"
				    + "Please choose department to proceed:\n\n"
					+ "1. Admin\n"
					+ "2. Human Resources\n"
					+ "3. Technical\n"
					+ "4. Legal\n"
					+ "5. Exit"
					);
			selection = sc.nextInt();
			
			switch(selection) {
			
			case 1:
				this.department = "admin"; 
				//Calling Credentials class method to generate & Print email & Password
				credentials.emailAndPassword(department,firstName,lastName);
				break;
					
			case 2:
				this.department = "humanresources"; 
				//Calling Credentials class method to generate & Print email & Password
				credentials.emailAndPassword(department,firstName,lastName);
				break;
					
			case 3:
				this.department = "technical"; 
				//Calling Credentials class method to generate & Print email & Password
				credentials.emailAndPassword(department,firstName,lastName);
				break;
					
			case 4:
				this.department = "legal"; 
				//Calling Credentials class method to generate & Print email & Password
				credentials.emailAndPassword(department,firstName,lastName);
				break;
					
			case 5:
				// Exit option selecting by user
				break;
				
			default : // Incrementing count for max of 2 nos. invalid inputs
				count++; 
				if (count<2){System.err.println("Invalid entry, please try again");}
				else {System.err.println("Invalid entry 2 times, Program is exiting");}
				
			}
			
		}while((selection > 5 || selection < 1) && count<2);
	    	
	}  	


}

package com.company.Credentials;

import java.util.*;

public class Credentials {
	
    int length = 10;
	
	// Parameterized constructor to generate & Print the email & password 
    public void emailAndPassword(String department, String firstName, String lastName) {
		System.out.println("Your email address is: "+firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".company.com");
		System.out.println("Your email password is: "+getPassword(8));
				
	}

	 //Method to generate & return password String
     static String getPassword(int len)
    {
        String CapitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SmallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&*";
 
        Random random = new Random();
 
        char[] pass = new char[len];
        String password;
       
        // Setting Char type array indices with conditional password containing 
        // Minimum of One Capital, One Numeric, One Special characters
        pass[0] = CapitalChars.charAt(random.nextInt(CapitalChars.length()));
        pass[1] = symbols.charAt(random.nextInt(symbols.length()));
        pass[2] = numbers.charAt(random.nextInt(numbers.length()));
        
        // Setting Balance length of Char type array with only small characters 
        for (int i = 3; i < len; i++){
            pass[i] = SmallChars.charAt(random.nextInt(SmallChars.length()));
        }
        
        //Converting Char array into String type
        password = String.valueOf(pass);
        return password;
    }

}

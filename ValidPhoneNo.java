package com.collabera.corejava.phone;

import java.util.*;
import java.lang.String;
 
public class ValidPhoneNo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your 10 digit telephone number: ");
		String string1 = input.next();
		input.close();
		
        int count = 0;
        for (int i = 0, len = string1.length(); i < len; i++) {
           if (Character.isDigit(string1.charAt(i))) {
        	   count++;}
         }
        
     
	    if (string1.contains("911") || count != 10) {
		  System.out.println("Sorry, this is an invalid number. Please try again.");
		} else {
		  System.out.println("This is a valid number. Thanks and enjoy your day!");
		}}}
	
	
	
	
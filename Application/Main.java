package com.masai.Application;

import java.util.Scanner;

import com.masai.usecases.loginEmployee;

public class Main {
	
	public static void main(String[] args) {
		                   
		Scanner sc= new Scanner(System.in);
		
		System.out.println("--------Welcome To Human Resource Management---------");
		System.out.println();
		System.out.println("-------Plese Choose Options--------");
		System.out.println("--------------------------------------");
		
		System.out.println("Press 1 for Login As Admin");
		System.out.println();
		System.out.println("Press 2 for login As Employee");
		System.out.println();
		System.out.println("Press 3 for Exit");
		
		System.out.println();
		System.out.println();
		
		int choice =sc.nextInt();
		
		switch (choice) {
		
		case 1: {
			
			System.out.println("Enter Admin Username : ");
			String username=sc.next();
			
			System.out.println("Enter Admin Password : ");
			String pass = sc.next();
			
			if(username.equals("admin") && pass.equals("123")) {
				
				adminLink.linkingAdmin();
			}
				else 
				{
				System.out.println("Wrong Username And PassWord");
				}
			break;
			
		}
		case 2:{
			loginEmployee.loginEmployee();
			break;
			
		}
		case 3:{
			System.out.println("Application Closed");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
	
	}

}


































































































//made by falgun bokde web 18 fw18_0390

package com.masai.usecases;


import java.util.Scanner;

import com.masai.Application.employeeLink;
import com.masai.Exception.EmployeeException;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class loginEmployee {
	
	public static void main(String[] args) {
		
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter Username : ");
//		String username=sc.next();
//		
//		System.out.println("Enter password : ");
//		String pass = sc.next();
//		
//		EmployeeDao dao=new EmployeeDaoImpl();
//		
//		
//		try {
//			Employee employee = dao.loginEmployee(username, pass) ;
//			System.out.println("Welcome Employee : "+employee.getEname());
//					
//		} catch (EmployeeException e) {
//			System.out.println(e.getMessage());
//		}
		
	}
	
	
	public static void loginEmployee() {
		

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String username=sc.next();
		
		System.out.println("Enter password : ");
		String pass = sc.next();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		
		try {
			Employee employee = dao.loginEmployee(username, pass) ;
			System.out.println("Welcome Employee : "+employee.getEname());
			employeeLink.linkingEmployeeMethod();
					
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}

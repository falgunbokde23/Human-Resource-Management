package com.masai.usecases;

import java.util.Scanner;
import com.masai.Exception.EmployeeException;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class getEmployeeById { 
	
	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Employee Id : ");
//		int eid=sc.nextInt();
//		
//		
//		EmployeeDao dao= new EmployeeDaoImpl();
//		
//		
//		try {
//			
//			Employee employee = dao.getEmployeeById(eid);
//			System.out.println(employee);
//			
//			
//			
//		} catch (EmployeeException se) {
//			System.out.println(se.getMessage());
//		}
//	
	}
	
	
	public static void viewEmployById() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		int eid=sc.nextInt();
		
		
		EmployeeDao dao= new EmployeeDaoImpl();
		
		
		try {
			
			Employee employee = dao.getEmployeeById(eid);
			System.out.println(employee);
			
			
			
		} catch (EmployeeException se) {
			System.out.println(se.getMessage());
		}
	
	}

}

package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class acceptLeavesUsecase {
	
	public static void main(String[] args) {
		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter Employee Id  : ");
//			int empid=sc.nextInt();
//			
//			EmployeeDao dao = new EmployeeDaoImpl();
//			
//			String result = dao.acceptLeaves(empid);
//			
//			System.out.println(result);
	}

	
	public static void acceptLeaves() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id  : ");
		int empid=sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String result = dao.acceptLeaves(empid);
		
		System.out.println(result);
	}
}

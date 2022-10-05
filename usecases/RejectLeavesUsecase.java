package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class RejectLeavesUsecase {

	
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Employee Id  : ");
//		int empid=sc.nextInt();
//		
//		EmployeeDao dao = new EmployeeDaoImpl();
//		
//		String result = dao.rejectLeaves(empid);
//		
//		System.out.println(result);
}
	
	public static void rejectLeaves() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id  : ");
		int empid=sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String result = dao.rejectLeaves(empid);
		
		System.out.println(result);
	}
}

package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class applyForLeaveUsecase {
	
	public static void main(String[] args) {
		
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter Employee ID :");
//		int empid=sc.nextInt();
//		
//		System.out.println("Wants to Apply For Leave then Type Applied");
//		String app=sc.next();
//		
//	    EmployeeDao dao=new EmployeeDaoImpl();
//		
//	    String result= dao.applyLeave(empid, app);
//		
//	    System.out.println(result);
	    
	}
	
	public static void applyLeaves() {
	   
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Employee ID :");
		int empid=sc.nextInt();
		
		System.out.println("Wants to Apply For Leave then Type Applied");
		String app=sc.next();
		
	    EmployeeDao dao=new EmployeeDaoImpl();
		
	    String result= dao.applyLeave(empid, app);
		
	    System.out.println(result);
	}

}

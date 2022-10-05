package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class RegisterEmployeeUsecase {
	
	public static void main(String[] args) {
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter Employee Name :");
//		String Ename=sc.next();
//		
//		System.out.println("Enter Employee Username : ");
//		String Username=sc.next();
//		
//		System.out.println("Enter Employee Password : ");
//		String pass = sc.next();
//		
//		System.out.println("Enter Employee Department Id : ");
//		int Edid=sc.nextInt();
//		
//		
//		EmployeeDao dao =new EmployeeDaoImpl();
//		
//		Employee employee = new Employee();
//		employee.setEname(Ename);
//		employee.setUsername(Username);
//		employee.setPassword(pass);
//		employee.setEdid(Edid);
//		
//		String result =dao.registerEmployee(employee);
//		
//		System.out.println(result);
//		
		
	}
	
	public static void registerEmployee() {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Employee Name :");
		String Ename=sc.next();
		
		System.out.println("Enter Employee Username : ");
		String Username=sc.next();
		
		System.out.println("Enter Employee Password : ");
		String pass = sc.next();
		
		System.out.println("Enter Employee Department Id : ");
		int Edid=sc.nextInt();
		
		
		EmployeeDao dao =new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		employee.setEname(Ename);
		employee.setUsername(Username);
		employee.setPassword(pass);
		employee.setEdid(Edid);
		
		String result =dao.registerEmployee(employee);
		
		System.out.println(result);
		
		
	}
	

}

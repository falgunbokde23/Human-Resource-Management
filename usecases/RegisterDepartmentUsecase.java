package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Department;
import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImpl;

public class RegisterDepartmentUsecase {
	
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter Department Name :");
//		String dname=sc.next();
//		
//		System.out.println("Enter Department DNO : ");
//		int dNO=sc.nextInt();
//		
//		
//		DepartmentDao dao = new DepartmentDaoImpl();
//		
//		Department department = new Department();
//		
//		department.setDname(dname);
//		department.setDNO(dNO);
//		
//		String result = dao.registerDepartment(department);
//		
//		System.out.println(result);
//	}
	
	public static void register() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Department Name :");
		String dname=sc.next();
		
		System.out.println("Enter Department DNO : ");
		int dNO=sc.nextInt();
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
		Department department = new Department();
		
		department.setDname(dname);
		department.setDNO(dNO);
		
		String result = dao.registerDepartment(department);
		
		System.out.println(result);
	}

}

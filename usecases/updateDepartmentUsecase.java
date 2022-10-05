package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Department;
import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImpl;

public class updateDepartmentUsecase {
	
	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Department Name : ");
//		String dname=sc.next();
//		
//		System.out.println("Enter Department DId : ");
//		int did=sc.nextInt();
//		
//		DepartmentDao dao=new DepartmentDaoImpl();
//		
//		Department department = new Department();
//		
//		department.setDname(dname);
//		department.setDNO(did);
//		
//		String result = dao.updateDepartment(department);
//		
//		System.out.println(result);
	}
	
	
	public static void updatedept() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department Name : ");
		String dname=sc.next();
		
		System.out.println("Enter Department DId : ");
		int did=sc.nextInt();
		
		DepartmentDao dao=new DepartmentDaoImpl();
		
		Department department = new Department();
		
		department.setDname(dname);
		department.setDNO(did);
		
		String result = dao.updateDepartment(department);
		
		System.out.println(result);
	}

}

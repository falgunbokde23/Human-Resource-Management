package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class transferDepartmentUsecase {
	
	public static void main(String[] args) {
		
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter New Department Id : ");
//		int edid= sc.nextInt();
//		
//		System.out.println("Enter Employee ID : ");
//		int eid=sc.nextInt();
//		
//		EmployeeDao dao=new EmployeeDaoImpl();
//		Employee employee = new Employee();
//		
//		employee.setEdid(edid);
//		employee.setEid(eid);
//		
//		String rs = dao.changeDepartment(eid, edid);
//		
//		System.out.println(rs);
	}
	
	public static void transferdepart() {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter New Department Id : ");
		int edid= sc.nextInt();
		
		System.out.println("Enter Employee ID : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		Employee employee = new Employee();
		
		employee.setEdid(edid);
		employee.setEid(eid);
		
		String rs = dao.changeDepartment(eid, edid);
		
		System.out.println(rs);
	}

}

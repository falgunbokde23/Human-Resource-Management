package com.masai.usecases;

import java.util.Scanner;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class updatepasswordEmpUsecase {
	
	public static void main(String[] args) {
		
			
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter New Password : ");
//		String pass= sc.next();
//		
//		System.out.println("Enter Employee ID : ");
//		int eid=sc.nextInt();
//		
//		EmployeeDao dao=new EmployeeDaoImpl();
//		Employee employee = new Employee();
//		
//		employee.setPassword(pass);
//		employee.setEid(eid);
//		
//		String rs = dao.changePassword(eid, pass);
//		
//		System.out.println(rs);
		
		
	}
	
	public static void changePassword() {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter New Password : ");
		String pass= sc.next();
		
		System.out.println("Enter Employee ID : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		Employee employee = new Employee();
		
		employee.setPassword(pass);
		employee.setEid(eid);
		
		String rs = dao.changePassword(eid,pass);
		
		System.out.println(rs);
	}

}

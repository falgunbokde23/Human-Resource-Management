package com.masai.usecases;

import java.util.List;
import com.masai.Exception.departmentException;
import com.masai.bean.Department;
import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImpl;


public class getAllDepartmentUsecase {
	
	
//	public static void main(String[] args) {
//		
//
//		DepartmentDao dao = new DepartmentDaoImpl();
//		
//		try {
//			
//		List<Department> dep=dao.allDepartment();
//		
//		dep.forEach(e->{
//			System.out.println("Employee Id is : "+ e.getDname());
//			System.out.println("Employe name is : "+e.getDNO());
//			
//			
//			System.out.println("=====================================");
//		});
//		
//		
//		
//		} catch (departmentException e) {
//		
//			System.out.println(e.getMessage());
//		}
//	}
	
	public static void viewAllDepartment() {
		DepartmentDao dao = new DepartmentDaoImpl();
		
		try {
			
		List<Department> dep=dao.allDepartment();
		
		dep.forEach(e->{
			System.out.println("Employee Id is : "+ e.getDname());
			System.out.println("Employe name is : "+e.getDNO());
			
			
			System.out.println("=====================================");
		});
		
		
		} catch (departmentException e) {
		
			System.out.println(e.getMessage());
		}
	}

}

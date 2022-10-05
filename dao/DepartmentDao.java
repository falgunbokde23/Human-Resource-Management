package com.masai.dao;

import java.util.List;
import com.masai.Exception.departmentException;
import com.masai.bean.Department;


public interface DepartmentDao  {
	
	 public String registerDepartment(Department Department);
	
	 public List<Department> allDepartment()throws departmentException;
	 
	 public String updateDepartment(Department department);
	

}

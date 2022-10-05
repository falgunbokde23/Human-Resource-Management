package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exception.EmployeeException;
import com.masai.bean.Employee;
import com.masai.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{


	@Override
	public String registerEmployee(Employee Employee) {
		
	String message ="Not Inserted..";
		
		
		
		try(Connection conn= DBUtil.provideConnection();) {
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(Ename,Username,Password,Edid) value(?,?,?,?)");
			
			
			ps.setString(1, Employee.getEname());
			ps.setString(2, Employee.getUsername());
			ps.setString(3, Employee.getPassword());
			ps.setInt(4,Employee.getEdid());
			
			int X= ps.executeUpdate();
			
			if(X>0)
				message="Employee Registered Sucessfully !";
			
			
			} catch (SQLException e) {
				message=e.getMessage();
			}
			
			return message;
		
	}

	
	
	
	@Override
	public Employee getEmployeeById(int Eid) throws EmployeeException {
		
		Employee employee= null;
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from employee where Eid=?");
			
			ps.setInt(1, Eid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int eid= rs.getInt("Eid");
				String Ename= rs.getString("Ename");
				String username=rs.getString("Username");
				String pass=rs.getString("password");
				int edid = rs.getInt("Edid");
				
				employee= new Employee(eid, Ename, username, pass, edid);
			}
			else 
				throw new EmployeeException("Employee Does not exist with Eid "+Eid);
			
				
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return employee;
	}




	@Override
	public Employee loginEmployee(String Username, String password) throws EmployeeException {
		Employee employee=null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from Employee where username=? AND password=?");
			
			ps.setString(1, Username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int eid= rs.getInt("Eid");
				String Ename= rs.getString("Ename");
				String username=rs.getString("Username");
				String pass=rs.getString("password");
				int edid = rs.getInt("Edid");
				
				employee= new Employee(eid, Ename, username, pass, edid);
			}
			else 
				throw new EmployeeException("Invalid Username or password...");
		
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		
		
		
		return employee;
	}




	@Override
	public List<Employee> allEmployeeDetails() throws EmployeeException {
		
		List<Employee> employees= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from employee");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int eid= rs.getInt("Eid");
				String Ename= rs.getString("Ename");
				String username=rs.getString("Username");
				String pass=rs.getString("password");
				int edid = rs.getInt("Edid");
				
				Employee employee= new Employee(eid, Ename, username, pass, edid);

				employees.add(employee);
				
			}
			
		}catch (SQLException e) {
		throw new EmployeeException();
		
		}
		if(employees.size()==0) 
			throw new EmployeeException("No Employee Found ! .. ");
		
		
		
		
		return employees;
	}




	@Override
	public String updateEmployee(Employee employee, int Eid) {

		String message="Employee Not fount !...";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update Employee set Ename=?,username=?,Password=? where Eid=?");
			
			ps.setString(1, employee.getEname());
			ps.setString(2, employee.getUsername());
			ps.setString(3, employee.getPassword());
			ps.setInt(4, employee.getEid());
		
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Employee update";
			}
			
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		return message;
	}




	@Override
	public String changePassword(int Eid , String Password) {
	String message="Employee Not found !...";
		
	Employee employee =new Employee();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update employee set password=? where Eid=?");
		    ps.setString(1, employee.getPassword() );
			ps.setInt(2, employee.getEid());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Password update";
			}
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		return message;
	}




	@Override
	public String changeDepartment(int Eid, int EDid) {
		String message="Department Not found !...";
		
		Employee employee =new Employee();
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update employee set Edid=? where Eid=?");
			    ps.setInt(1, employee.getEdid());
				ps.setInt(2, employee.getEid());
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Department update";
				}
				
				
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
	}




	@Override
	public String applyLeave(int empId, String status) {
		
		String message ="Not Applied..";
		
		
		
		try(Connection conn= DBUtil.provideConnection();) {
			
			PreparedStatement ps = conn.prepareStatement("insert into leaves value(?,?)");
			
			
			ps.setInt(1, empId);
			ps.setString(2, status);
			
			int X= ps.executeUpdate();
			
			if(X>0)
				message=" Applied For leave Sucessfully !";
			
			
			} catch (SQLException e) {
				message=e.getMessage();
			}
			
			return message;
	}




	@Override
	public String acceptLeaves(int empId) {
		
		String message="Employee Not found !...";
	
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update leaves set status='Approve' where empId=?");
		
				ps.setInt(1, empId);
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Employee leaves Accepted ";
				}
				
				
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
	}




	@Override
	public String rejectLeaves(int empId) {
		
		String message="Employee Not found !...";
		
		
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update leaves set status='Reject' where empId=?");
				ps.setInt(1, empId);
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Employee leaves Rejected Sucssesfully ";
				}
				
				
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
		}
	
	}




	
	
	

	
	
	
	
	
	
	
	
	
	
	


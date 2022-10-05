package com.masai.bean;

public class Employee {
	private int Eid;
	private String Ename;
	private String Username;
	private String Password;
	private int Edid;
	
	public Employee() {
		
	}
	
	
	
	public Employee(int eid, String ename, String username, String password, int edid) {
		
		Eid = eid;
		Ename = ename;
		Username = username;
		Password = password;
		Edid = edid;
	}



	public int getEid() {
		return Eid;
	}



	public void setEid(int eid) {
		Eid = eid;
	}



	public String getEname() {
		return Ename;
	}



	public void setEname(String ename) {
		Ename = ename;
	}



	public String getUsername() {
		return Username;
	}



	public void setUsername(String username) {
		Username = username;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public int getEdid() {
		return Edid;
	}



	public void setEdid(int edid) {
		Edid = edid;
	}



	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Username=" + Username + ", Password=" + Password
				+ ", Edid=" + Edid + "]";
	}





	
	
	
	

}

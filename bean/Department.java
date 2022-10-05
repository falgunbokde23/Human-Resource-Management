package com.masai.bean;

public class Department {
	private String Dname;
	private int DNO;

	
	public Department(){
		
	}
	
	public Department(String dname, int dNO, int did) {
		Dname = dname;
		DNO = dNO;

	}


	public String getDname() {
		return Dname;
	}


	public void setDname(String dname) {
		Dname = dname;
	}


	public int getDNO() {
		return DNO;
	}


	public void setDNO(int dNO) {
		DNO = dNO;
	}

	@Override
	public String toString() {
		return "Department [Dname=" + Dname + ", DNO=" + DNO + "]";
	}


	
	
	
	

}

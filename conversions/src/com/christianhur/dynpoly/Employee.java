package com.christianhur.dynpoly;
import java.text.DecimalFormat;

public class Employee extends Person {
	private String title;
	private String department;
	private double salary;

	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		return this.getFirstName() 
				+ ", " + this.getLastName() 
				+ ", " + this.getEmail()
				+ ", " + this.getTitle()
				+ ", " + this.getDepartment()
				+ ", $" + formatter.format(this.getSalary());
	}
	
	// Getters and Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

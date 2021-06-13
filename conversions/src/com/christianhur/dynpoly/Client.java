package com.christianhur.dynpoly;
import java.text.DecimalFormat;

public class Client extends Person {
	private String project;
	private double budget;

	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		return this.getFirstName() 
				+ ", " + this.getLastName() 
				+ ", " + this.getEmail()
				+ ", " + this.getProject()
				+ ", $" + formatter.format(this.getBudget());
	}
	
	// Getters and Setters
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
}

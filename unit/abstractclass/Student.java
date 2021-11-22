package com.christianhur.inheritance;

public abstract class Student {
	
	private int sid;
	private String lastName;
	private String firstName;
	protected int tuition;
	protected String type;
	
	public Student(int sid, String lastName, String firstName) {
		this.setSid(sid);
		this.setLastName(lastName);
		this.setFirstName(firstName);
	}
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getTuition() {
		return tuition;
	}
	public abstract void setTuition(int tuition);	
	
	public String getType() {
		return type;
	}

	public abstract void setType(String type);

}

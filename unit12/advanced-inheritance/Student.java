package com.christianhur.inheritance;

/**
 * Abstract parent class
 */
public abstract class Student {

	private int sid;
	private String lastName;
	private String firstName;
	protected int tuition; // Must set to protected - to be set by subclass
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

	// Let subclass implement
	public abstract void setTuition(int tuition);

	public String getType() {
		return type;
	}

	// Let subclass implement
	public abstract void setType(String type);

}

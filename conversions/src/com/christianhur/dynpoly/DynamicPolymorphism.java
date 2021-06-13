package com.christianhur.dynpoly;

import java.util.Scanner;

public class DynamicPolymorphism {
	static final int MAX_EMP = 3;
	static final int MAX_MGR = 2;
	static final int MAX_CLI = 3;
	static final String PERSON_TYPE_EMP = "Employee";
	static final String PERSON_TYPE_MGR = "Manager";
	static final String PERSON_TYPE_CLI = "Client";
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Employee[] employees = new Employee[MAX_EMP];
		Manager[] managers = new Manager[MAX_MGR];
		Client[] clients = new Client[MAX_CLI];

		int e = 0, m = 0, c = 0;
		boolean quit = false;
		do {
			Helper.displayMenu();
			char choice = Helper.getSelection();
			switch (choice) {
			case 'E':
				if (e < MAX_EMP) {
					System.out.printf("\n\t:::Enter Employee #%d Data:::\n\n", e + 1);
					employees[e] = new Employee();
					enterEmployeeData(employees[e++]);
				} else {
					System.out.printf("\n\t*** No more employees to add.");
				}
				break;
			case 'M':
				if (m < MAX_MGR) {
					System.out.printf("\n\t:::Enter Manager #%d Data:::\n\n", e + 1);
					managers[m] = new Manager();
					enterManagerData(managers[m++]);
				} else {
					System.out.printf("\n\t*** No more managers to add.");
				}
				break;
			case 'C':
				if (c < MAX_CLI) {
					System.out.printf("\n\t:::Enter Client #%d Data:::\n\n", c + 1);
					clients[c] = new Client();
					enterClientData(clients[c++]);
				} else {
					System.out.printf("\n\t*** No more clients to add.");
				}
				break;
			case 'Q':
				quit = true;
				break;
			default:
				System.out.println("\n\t*** Invalid selection.  Try again.");
				break;
			}
			if (!quit) {
				quit = Helper.doContinue();
			}
		} while (!quit);

		input.close();
		Helper.printDetails(employees, PERSON_TYPE_EMP);
		Helper.printDetails(managers, PERSON_TYPE_MGR);
		Helper.printDetails(clients, PERSON_TYPE_CLI);

		System.out.println("\n\t*** Thank you for playing.  Goody-bye. ***");
	}

	public static void enterPersonData(Person person) {
		person.setFirstName(Helper.getString("First Name"));
		person.setLastName(Helper.getString("Last Name"));
		person.setEmail(Helper.getString("Email"));
	}

	
	public static void enterData(Employee e, Manager m, Client c) {
		if(e != null) {
			e.setFirstName(Helper.getString("First Name"));
			e.setLastName(Helper.getString("Last Name"));
			e.setEmail(Helper.getString("Email"));
		}else if(m != null) {
			m.setFirstName(Helper.getString("First Name"));
			m.setLastName(Helper.getString("Last Name"));
			m.setEmail(Helper.getString("Email"));
		}else {
			c.setFirstName(Helper.getString("First Name"));
			c.setLastName(Helper.getString("Last Name"));
			c.setEmail(Helper.getString("Email"));
		}
	}
	
	public static void enterEmployeeData(Employee employee) {
//		employee.setFirstName(Helper.getString("First Name"));
//		employee.setLastName(Helper.getString("Last Name"));
//		employee.setEmail(Helper.getString("Email"));
		enterPersonData(employee);
		employee.setTitle(Helper.getString("Title"));
		employee.setDepartment(Helper.getString("Department"));
		employee.setSalary(Helper.getDouble("Salary"));	
	}

	public static void enterManagerData(Manager manager) {
//		manager.setFirstName(Helper.getString("First Name"));
//		manager.setLastName(Helper.getString("Last Name"));
//		manager.setEmail(Helper.getString("Email"));
//		manager.setTitle(Helper.getString("Title"));
//		manager.setDepartment(Helper.getString("Department"));
//		manager.setSalary(Helper.getDouble("Salary"));		
		enterEmployeeData(manager);
		manager.setBonus(Helper.getDouble("Bonus"));
	}

	public static void enterClientData(Client client) {
//		client.setFirstName(Helper.getString("First Name"));
//		client.setLastName(Helper.getString("Last Name"));
//		client.setEmail(Helper.getString("Email"));
		enterPersonData(client);
		client.setProject(Helper.getString("Project Title"));
		client.setBudget(Helper.getDouble("Budget"));
	}
}

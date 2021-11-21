package com.christianhur.dynpoly;

import java.util.Scanner;

public class DynamicPolymorphism {
	static Scanner input = new Scanner(System.in);
	static final int INDEX_EMP = 0;
	static final int INDEX_MGR = 1;
	static final int INDEX_CLI = 2;
	static final String E = "employee";
	static final String M = "manager";
	static final String C = "client";
	static int employeeCount = 0; 
	static int managerCount	= 0; 
	static int clientCount	= 0;
	static final int MAX_EMP = getMaxPersonType(E);
	static final int MAX_MGR = getMaxPersonType(M);
	static final int MAX_CLI = getMaxPersonType(C);
		
	public static void main(String[] args) {
						
		Person[][] personList = new Person[][] { new Employee[MAX_EMP], new Manager[MAX_MGR], new Client[MAX_CLI] };
		
		while (true) {
			Helper.displayMenu();
			char choice = Helper.getSelection();
			switch (choice) {
				case 'E':
					processEmployee((Employee[]) personList[INDEX_EMP], employeeCount++);
					break;
				case 'M':
					processManager((Manager[]) personList[INDEX_MGR], managerCount++);
					break;
				case 'C':
					processClient((Client[]) personList[INDEX_CLI], clientCount++);
					break;
				case 'Q':
					break;
				default:
					System.out.println("\n\t*** Invalid selection.  Try again.");
					break;
			}
			if (choice == 'Q' || !Helper.doContinue())
				break;
		}
		input.close();
		
		// Print list only if not empty
		for(Person[] persons : personList)
			for(Person person : persons)
				if(person != null) {
					Helper.printDetails(personList);
					break;
			}
		
		goodBye();
		
	}

	private static int getMaxPersonType(String type) {		
		try {
			System.out.printf("How many %s? >>", type);			
			return Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("\t*** Invalid input.  Must be integer.  Try again");
		}
		return getMaxPersonType(type);
	}

	private static void goodBye() {		
		System.out.println("\n\t*****************************************");		
		System.out.println("\n\t*** Thank you for playing.  Good-bye. ***");		
		System.out.println("\n\t*****************************************");		
	}

	private static void processClient(Client[] clients, int i) {
		if (i < MAX_CLI) {
			System.out.printf("\n\t:::Enter Client #%d Data:::\n\n", i + 1);
			clients[i] = new Client();
			enterClientData(clients[i]);
		} else {
			System.out.printf("\n\t*** No more clients to add.");
		}		
	}

	private static void processManager(Manager[] managers, int i) {
		if (i < MAX_MGR) {
			System.out.printf("\n\t:::Enter Manager #%d Data:::\n\n", i + 1);
			managers[i] = new Manager();
			enterManagerData(managers[i]);
		} else {
			System.out.printf("\n\t*** No more managers to add.");
		}
	}

	private static void processEmployee(Employee[] employees, int i) {
		if (i < MAX_EMP) {
			System.out.printf("\n\t:::Enter Employee #%d Data:::\n\n", i + 1);
			employees[i] = new Employee();
			enterEmployeeData(employees[i]);
		} else {
			System.out.printf("\n\t*** No more employees to add.");
		}		
	}

	public static void enterPersonData(Person person) {
		person.setFirstName(Helper.getString("First Name"));
		person.setLastName(Helper.getString("Last Name"));
		person.setEmail(Helper.getString("Email"));
	}
	
	public static void enterEmployeeData(Employee employee) {
		enterPersonData(employee);
		employee.setTitle(Helper.getString("Title"));
		employee.setDepartment(Helper.getString("Department"));
		employee.setSalary(Helper.getDouble("Salary"));	
	}

	public static void enterClientData(Client client) {
		enterPersonData(client);
		client.setProject(Helper.getString("Project Title"));
		client.setBudget(Helper.getDouble("Budget"));
	}

	public static void enterManagerData(Manager manager) {
		enterEmployeeData(manager);
		manager.setBonus(Helper.getDouble("Bonus"));
	}
}

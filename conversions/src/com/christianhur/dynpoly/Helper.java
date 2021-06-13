package com.christianhur.dynpoly;
import java.util.Scanner;

final class Helper {
	static Scanner input = new Scanner(System.in);
	
	public static void printDetails(Person[] persons, String type) {
		System.out.println("\n\t--------------------");
		System.out.println("\t" + type + " Information");
		System.out.println("\t--------------------");
		for(int i=0; i<persons.length; i++) {			
			System.out.print("\t" + (i+1) + ". ");
			System.out.println(persons[i] != null ? persons[i] : "Not entry.");
		}
	}
	
	public static void displayMenu() {
		System.out.println("\n\t::::MAIN MENU::::");
		System.out.println("\t[E] Employee");
		System.out.println("\t[M] Manager");
		System.out.println("\t[C] Client");
		System.out.println("\t[Q] Quit");
	}
	
	public static boolean doContinue() {
		System.out.print("\n\tContinue (Y/n):");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("N")) {
			return true;
		}
		return false;
	}

	public static char getSelection() {
		System.out.print("\n\tSelection [E,M,C,Q]>");
		return Character.toUpperCase(input.nextLine().charAt(0));
	}
	
	public static String getString(String field) {
		System.out.printf("\t%s:",field);
		return input.nextLine();
	}
	
	public static double getDouble(String field) {
		do {
			try {
				System.out.printf("\t%s:",field);
				return Double.parseDouble(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("\t*** Invalid input.  Must be numeric.  Try again");
			} 
		} while (true);
	}
	
	public static int getInteger(String field) {
		do {
			try {
				System.out.printf("\t%s:",field);
				return Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("\t*** Invalid input.  Must be numeric.  Try again");
			} 
		} while (true);
	}
}

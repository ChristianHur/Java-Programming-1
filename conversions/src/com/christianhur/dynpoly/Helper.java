package com.christianhur.dynpoly;

import java.util.Scanner;

final class Helper {
	static Scanner input = new Scanner(System.in);

	/**
	 * Method to print details of a Person type.
	 * 
	 * @param persons 2D Array of Person objects
	 */
	public static void printDetails(Person[][] persons) {
		for (Person[] person : persons) {
			String type = person.getClass().getSimpleName().replace("[]", "");
			System.out.println("\n\t--------------------");
			System.out.println("\t" + type + " Information");
			System.out.println("\t--------------------");
			for (int i = 0; i < person.length; i++) {
				System.out.print("\t" + (i + 1) + ". ");
				System.out.println(person[i] != null ? person[i] : "Not entry.");
			}
		}
	}

	/**
	 * Method to display the main menu.
	 */
	public static void displayMenu() {
		System.out.println("\n\t::::MAIN MENU::::");
		System.out.println("\t[E] Employee");
		System.out.println("\t[M] Manager");
		System.out.println("\t[C] Client");
		System.out.println("\t[Q] Quit");
	}

	/**
	 * Method to ask if user wants to continue -- recursive call
	 * 
	 * @return A boolean value
	 */
	public static boolean doContinue() {
		System.out.print("\n\tContinue (Y/n):");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("Y"))
			return true;
		if (choice.equalsIgnoreCase("N"))
			return false;
		System.out.println("\t*** Invalid input.  Must be numeric.  Try again");
		return doContinue();
	}

	/**
	 * Method to get an type of Person input selection
	 * 
	 * @return A character: E, M, C, or Q
	 */
	public static char getSelection() {
		System.out.print("\n\tSelection [E,M,C,Q]>");
		return Character.toUpperCase(input.nextLine().charAt(0));
	}

	/**
	 * Method to read an input string of a given field
	 * 
	 * @param field The given field name for this string
	 * @return The string value for the field
	 */
	public static String getString(String field) {
		System.out.printf("\t%s:", field);
		return input.nextLine();
	}

	/**
	 * Method to get a double value -- recursive call
	 * 
	 * @param field The field name for this double value
	 * @return The double value
	 */
	public static double getDouble(String field) {
		try {
			System.out.printf("\t%s:", field);
			return Double.parseDouble(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("\t*** Invalid input.  Must be numeric.  Try again");
		}
		return getDouble(field);
	}

	/**
	 * Method to get an integer value -- recursive call
	 * 
	 * @param field The field name for this integer value
	 * @return The integer value
	 */
	public static int getInteger(String field) {
		try {
			System.out.printf("\t%s:", field);
			return Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("\t*** Invalid input.  Must be numeric.  Try again");
		}
		return getInteger(field);
	}
}

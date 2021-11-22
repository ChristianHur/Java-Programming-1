package com.christianhur.inheritance;
/*
 * Create an abstract Student class for Acme University. The class contains fields for student ID number, first name, last name, student type, and annual tuition. Include a constructor that requires parameters for the ID number, first name, last name. Include get and set methods for each field; the setTuition() and setType() methods are abstract. Create three Student subclasses named UndergraduateStudent, GraduateStudent, and HighSchoolStudent, each with a unique setTuition() and setType() methods. Tuition for an UndergraduateStudent is $12,000 per semester, tuition for a GraduateStudent is $30,000 per semester, and tuition for a HighSchoolStudent is $4,000 per semester.  Student types are "Graduate", "Undergraduate", and "High School".
 * 
 * Student data are stored in a text (CSV) file. The CSV file contains four fields:  student id, first name, last name, type.
 * 
 * Write an application that reads the CSV file and creates an ArrayList of objects to demonstrate how the methods work for objects for each Student type. 
 *
 *  Finally, print each student information to the console as follows:
 *  
 *  =================================================================
 *  SID       First          Last           Type             Tuition
 *  -----------------------------------------------------------------
 *  2422      Ruzic          Marylynne      Graduate         $15,000
 *  8566      Larmuth        Alameda        Undergraduate    $8,500
 *  2934      Horwell        Emelia         High School      $5,500
 *  
 *  etc ...
 *  -----------------------------------------------------------------*  
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentProgram {

	static String fileName = "students.csv";

	public static void main(String[] args) {
		//File file = new File(fileName);

		ArrayList<Student> studentList = new ArrayList<>();

		try {
File file = new File(fileName);
Scanner input = new Scanner(file);
while (input.hasNextLine()) {
	String line = input.nextLine();
}
			Student student;

			while (input.hasNextLine()) {
				String line = input.nextLine();
				p(line);
				String[] fields = line.split(",");
				switch (fields[fields.length - 1]) {
				case "H":
					student = new HighSchoolStudent(Integer.parseInt(fields[0]), fields[1], fields[2]);
					studentList.add(student);
					break;
				case "U":
					student = new UndergraduateStudent(Integer.parseInt(fields[0]), fields[1],
							fields[2]);
					studentList.add(student);
					break;
				case "G":
					student = new GraduateStudent(Integer.parseInt(fields[0]), fields[1], fields[2]);
					studentList.add(student);
					break;
				}
			}

			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND.");
		}

		printResult(studentList);

	}
	static String spaces(String w, String c, int n) {
		n -= w.length();
		String s = "";
		for(int i=0; i<n; i++) {
			s += c;
		}
		return w+s;
	}

	static void printResult(ArrayList<Student> studentList) {
		System.out.println(spaces("=","=",65));
		System.out.print(spaces("SID"," ",10));
		System.out.print(spaces("First"," ",15));
		System.out.print(spaces("Last"," ",15));		
		System.out.print(spaces("Type"," ",17));
		System.out.println("Tuition");
		System.out.println(spaces("-","-",65));

		for(Student student : studentList) {
			System.out.print(spaces(Integer.toString(student.getSid())," ",10));
			System.out.print(spaces(student.getFirstName()," ",15));
			System.out.print(spaces(student.getLastName()," ",15));
			System.out.print(spaces(student.getType()," ",17));
			System.out.println("$" +  String.format("%,d",student.getTuition()) );
		}

		System.out.println(spaces("-","-",65));
	}
	
	static void p(Object obj) {
		System.out.println(obj.toString());
	}

}

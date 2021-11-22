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

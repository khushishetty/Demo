package program_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MissingFieldException extends Exception {
	public MissingFieldException(String field) {
		System.out.println("The " + field + " field is missing!");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Custom error";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Custom error";
	}
}

class Student implements Comparable<Student> {
	int age;
	int marks;
	String name;

	Student(int a, int m, String n) {
		this.age = a;
		this.marks = m;
		this.name = n;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (this.marks - o.marks);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.age + " " + this.marks;
	}

}

class StudentAgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		System.out.println("Sorting by age");
		return s1.age - s2.age;
	}
}

class StudentMarksComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		System.out.println("Sorting by marks");
		return s1.marks - s2.marks;
	}
}

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		Scanner ip = new Scanner(System.in);
		// s.add(new Student(21, 100, "Brian"));
		// s.add(new Student(22, 90, "Jenisha"));
		// s.add(new Student(18, 55, "Khushi"));
		// s.add(new Student(33, 89, "Raju"));
		// s.add(new Student(8, 22, "shilpa"));
		//
		//// Collections.sort(s);
		// StudentAgeComparator ageComparator = new StudentAgeComparator();
		// Collections.sort(s, ageComparator);
		//
		// System.out.println(s);
		//
		// StudentMarksComparator marksComparator = new StudentMarksComparator();
		// Collections.sort(s, marksComparator);

		System.out.println("Enter the number of students : ");
		int n = ip.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details for student " + (i + 1));
			try {
				System.out.print("Name : ");
				String name = ip.nextLine();
				
				if (name == "\n")
					throw new MissingFieldException("name");
				
				System.out.print("Age : ");
				int age = ip.nextInt();
				if (age == 0)
					throw new MissingFieldException("age");
				
				System.out.print("Marks : ");
				int marks = ip.nextInt();
				ip.nextLine();
				if (marks == 0)
					throw new MissingFieldException("marks");
				
				
				
				
				s.add(new Student(age, marks, name));

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		System.out.println(s);

	}

}
package program9;

import java.util.Scanner;

public class Program9 {

	static void isLeapYear(int year) {
		String res = (year%4==0)?((year%100==0)?((year%400==0)?"A leap year":"Not a leap year"):"A leap year"):"Not a Leap year";
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;

		Scanner ip = new Scanner(System.in);

		System.out.print("Enter the year : ");
		year = ip.nextInt();

		isLeapYear(year);

	}

}
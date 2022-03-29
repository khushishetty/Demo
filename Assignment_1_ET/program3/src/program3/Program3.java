package program3;

import java.util.Scanner;

public class Program3 {

	static void isLeapYear(int year) {
		String res;
		if(year%4==0)
		{
			if(year%100 ==0)
			{
				if(year%400==0)
					res="Leap year!";
				else
					res="Not leap year!";
			}
			else 
				res="Leap year!";
		}
		else {
			res="Not a leap year!";
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter the year : ");
		year = ip.nextInt();

		isLeapYear(year);

	}

}
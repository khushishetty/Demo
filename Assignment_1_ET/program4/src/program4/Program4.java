package program4;

import java.util.Scanner;

public class Program4 {

	static String converter(int month) {
		String res = null;
		switch (month) {
		case 1:
			res = "January";
			break;
		case 2:
			res = "February";
			break;
		case 3:
			res = "March";
			break;
		case 4:
			res = "April";
			break;
		case 5:
			res = "May";
			break;
		case 6:
			res = "June";
			break;
		case 7:
			res = "July";
			break;
		case 8:
			res = "August";
			break;
		case 9:
			res = "September";
			break;
		case 10:
			res = "October";
			break;
		case 11:
			res = "November";
			break;
		case 12:
			res = "December";
			break;
		default:
			
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the month : ");
		int monthNumber = ip.nextInt();
		
		System.out.println("The month entered is : " + converter(monthNumber));

	}

}

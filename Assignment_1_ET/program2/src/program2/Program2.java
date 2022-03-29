package program2;

import java.util.Scanner;

public class Program2 {

	static String minNotes(int sum) {
		int orgSum=sum;
		int[] denominations = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] numNotes = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < denominations.length; i++) {
			if (sum == 0)
				break;

			numNotes[i] = sum / denominations[i];
			sum = sum % denominations[i];

		}

		System.out.println("The minimum number of notes for Rs." + orgSum + " are : ");
		for (int i = 0; i < denominations.length; i++) {

			if (numNotes[i] != 0)
				System.out.println(numNotes[i] + " note(s) of Rs." + denominations[i]);

		}
		return null;
		// 1200 -> 200
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the amount");
		amount=ip.nextInt();
		
		
		minNotes(amount);
//		minNotes(475);
//		minNotes(530);
//		minNotes(212);

	}

}


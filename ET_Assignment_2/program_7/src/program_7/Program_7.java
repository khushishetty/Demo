package program_7;

import java.util.Scanner;

class DemoClass {
	public void missingFunc(int[] arr) {
		int n = arr.length;
		int actualSum = ((n + 1) * (n + 2)) / 2;
		int arraySum = 0;
		for (int i = 0; i < n; i++) {
			arraySum += arr[i];
		}

		System.out.println("The missing element is " + (actualSum - arraySum));
	}
}

public class Program_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		int arr[];
		int n;
		System.out.println("Enter n : ");
		n = ip.nextInt();

		arr = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < n; i++)
			arr[i] = ip.nextInt();
		new DemoClass().missingFunc(arr);

	}

}

package program_9;

import java.util.Scanner;

class RotatedClass {
	public int rotatedFunc(int[] arr) {
		int minEleInd = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[minEleInd] > arr[i])
				minEleInd = i;
		}
		return (minEleInd);
	}
}

public class Program_9 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int[] arr;
		int n;

		System.out.println("Enter the number of array elements : ");
		n = ip.nextInt();

		arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = ip.nextInt();
		}
		int res = new RotatedClass().rotatedFunc(arr);
		System.out.println("The array has to be rotated " + res + " times");
	}

}

package program10;

import java.util.Scanner;

class ArrayClass {
	int n, m;
	int[][] array;

	ArrayClass(int n, int m) {
		this.n = n;
		this.m = m;
		array = new int[n][m];
	}

	void readArray() {
		Scanner ip = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("array[" + i + "][" + j + "] : ");
				array[i][j] = ip.nextInt();
			}

		}
	}

	void display() {
		System.out.println("The entered array is : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}
	}

	int sumOfDiagonals() {
		int sum = 0;
		for (int i = 0; i < n && i<m; i++) {
			sum += array[i][i];
		}
		return sum;
	}
}

public class Program10 {
	public static void main(String[] args) {
		int rows, cols;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		rows = ip.nextInt();

		System.out.println("Enter the number of columns : ");
		cols = ip.nextInt();

		ArrayClass arr = new ArrayClass(rows, cols);
		arr.readArray();
		arr.display();

		System.out.println(arr.sumOfDiagonals());

	}

}

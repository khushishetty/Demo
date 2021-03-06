package program_4;

import java.util.Scanner;

class MatrixClass {
	private int row, col;
	private int[][] mat;

	public MatrixClass(int r, int c) {
		row = r;
		col = c;
		mat = new int[row][col];
	}

	public void readMatrix() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("mat[" + i + "][" + j + "] : ");
				mat[i][j] = sc.nextInt();
			}
		}
	}

	public void display() {
		System.out.println("The entered matrix is : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void diagonalSum() {
		if (row != col) {
			System.out.println("Cannot find the sum of the diagonal!");
			return;
		}
		int sum = 0;
		for (int i = 0; i < row; i++) {
			sum += mat[i][i];
		}

		System.out.println("Sum of the diagonal = " + sum);
	}
}

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixClass mc = new MatrixClass(3, 3);
		
		mc.readMatrix();
		mc.display();
		mc.diagonalSum();

	}

}

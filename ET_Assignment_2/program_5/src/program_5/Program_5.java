package program_5;

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
		int ele;
		System.out.println("Enter the elements : ");
		int i=0, j;
		int[] num = {1,1,1,1,1,1,1,1,1,1};
		while (i < row) {
			j=0;
			while (j < col) {
				System.out.print("mat[" + i + "][" + j + "] : ");
				ele = sc.nextInt();
				if(ele<0 || ele>9)
				{
					System.out.println("Please enter a number from 0-9");
					continue;
				}
					
				else {
					if(num[ele-1]==0)
						{
						System.out.println(ele+" already exists in the matrix! Enter a different value!");
						continue;
						}
					else
					{
						num[ele-1]=0;
						mat[i][j]=ele;
						j++;
					}
				}
			}
			i++;
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

}

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixClass mc = new MatrixClass(3, 3);
//		mc.readMatrix();
//		mc.display();
		
		System.out.println(mc);

	}

}

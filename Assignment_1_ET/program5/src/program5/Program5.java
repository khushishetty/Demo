package program5;

import java.util.Scanner;

class VanEcq {
	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public void VanecqSeq(int n) {

		int[] vanecq = new int[n];
		vanecq[0] = 0;
		for (int i = 1; i < n; i++) {
			int ele = vanecq[i - 1];
			int j = i - 2;
			while (j >= 0) {
				if (vanecq[j] == ele)
					break;
				j--;
			}
			if (j == -1)
				vanecq[i] = 0;
			else
				vanecq[i] = i - j - 1;
		}

		display(vanecq);

	}
}

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		System.out.println("Enter the value of n : ");
		Scanner ip = new Scanner(System.in);

		n = ip.nextInt();

		VanEcq v = new VanEcq();
		v.VanecqSeq(n);

	}

}

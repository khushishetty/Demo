package program_1;

import java.util.Scanner;

class BinaryGapClass {
	public void maxBinaryGap(int n) {
		StringBuffer binaryForm = new StringBuffer("");
		int digit;
		while (n != 0) {
			digit = n % 2;
			n = n / 2;
			binaryForm.append(digit);
		}
		System.out.println("The binary equvalent of " + n + " is : " + binaryForm);
		binaryForm.reverse();
		int maxGap = 0;
		for (int i = 0; i < binaryForm.length(); i++) {
			if (binaryForm.charAt(i) != '1') {
				continue;
			}
			int j = binaryForm.indexOf("1", i + 1);
			if ((j - i) > maxGap) {
				maxGap = j - i - 1;
				// System.out.println(maxGap);
			}

		}
		System.out.println("The maximum gap is : " + maxGap);
	}
}

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		int n;

		System.out.println("Enter the value of n : ");
		n = ip.nextInt();

		BinaryGapClass binaryGapClass = new BinaryGapClass();
		binaryGapClass.maxBinaryGap(n);

	}

}

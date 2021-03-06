package program7;

class StrongNumbers {

	public int factorial(int n) {
		int res = 1;
		while (n != 0) {
			res *= n;
			n--;
		}
		return res;
	}

	public void isStrongNo(int num) {
		int digit;
		int sum = 0;
		int orgNum = num;
		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			sum += factorial(digit);
		}
		if (sum == orgNum) {
			System.out.println(orgNum + " is Strong Number!");
		}
	}
}

public class Program7 {

	public static void main(String[] args) {

		StrongNumbers snum = new StrongNumbers();
		for (int i = 1; i <= 500; i++)
			snum.isStrongNo(i);
	}
}

package program8;

class ArmstrongNumbers {
	public void isArmstrongNo(int num) {
		int digit;
		int sum = 0;
		int length=0;
		int orgNum = num;
		
		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			length++;
		}
		
		num = orgNum;
		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			sum += Math.pow(digit, length);
		}
		if (sum == orgNum) {
			System.out.println(orgNum + " is Armstrong Number!");
		}
	}
}

public class Program8 {

	public static void main(String[] args) {

		ArmstrongNumbers anum = new ArmstrongNumbers();
		for (int i = 1; i <= 500; i++)
			anum.isArmstrongNo(i);
	}
}

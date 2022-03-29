package program1;

import java.util.Scanner;

class Solution {
	
	public int solution(int m, int n)
	{	
		int[] chocolate = new int[n];
		for (int i = 0; i < n; i++)
			chocolate[i] = 0;
		
		int j = 0, count = 0;
		do {
			chocolate[j] = -1;
			j = (j + m) % n;
			count++;
		} while (chocolate[j] != -1);

		return count;
	}
}

public class Program1 {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the number of Chocolates : ");
		int n = ip.nextInt();
		
		System.out.println("Enter M : ");
		int m = ip.nextInt();
		
		Solution s = new Solution();
		System.out.println(s.solution(m, n));
	}

}

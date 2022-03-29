package program_6;

import java.util.Scanner;

class FloristClass {
	public int Florist(int people, int flowers, int[] cost) {
		int i = cost.length - 1;
		int maxCost = 0;
		int count = 1;
		while (i >= 0) {
			for (int j = 0; j < 3; j++) {
				maxCost += (cost[i] * count);
				i--;
				if (i == -1)
					break;
			}
			count++;
		}
		return maxCost;
	}
}

public class Program_6 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int[] cost;
		int friends, flowers;

		System.out.println("Enter the number of friends : ");
		friends = ip.nextInt();
		System.out.println("Enter the number of flowers : ");
		flowers = ip.nextInt();

		cost = new int[flowers];

		System.out.println("Enter the cost of " + flowers + " flowers : ");
		for (int i = 0; i < flowers; i++)
			cost[i] = ip.nextInt();

		System.out.println(new FloristClass().Florist(friends, flowers, cost));

	}

}

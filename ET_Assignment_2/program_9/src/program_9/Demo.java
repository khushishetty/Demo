package program_9;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	static void getNearest(Set<Integer> planks, int req) {

		if (planks.contains(req)) {
			System.out.println("present");
		} else {
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 3 4 5 1 3
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(4, 1);
		tm.put(3, 1);
		tm.put(1, 5);
		tm.put(2, 10);

		System.out.println(tm);

		System.out.println("enter the size : ");
		Integer inp = sc.nextInt();

		Set<Integer> keys = tm.keySet();

		System.out.println(keys);

//		binarySearch(keys);

	}

}

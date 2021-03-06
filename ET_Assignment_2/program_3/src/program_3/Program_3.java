package program_3;

import java.util.HashMap;
import java.util.Scanner;

class RandsomClass {
	public void randsom(String[] magazine, String[] note) {
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < magazine.length; i++) {
			if (hm.containsKey(magazine[i])) {
				hm.put(magazine[i], hm.get(magazine[i]) + 1);
			} else {
				hm.put(magazine[i], 1);
			}
		}

		int flag = 1;
		for (int i = 0; i < note.length; i++) {
			if (!hm.containsKey(note[i])) {
				flag = 0;
				break;
			} else {
				if (hm.get(note[i]) > 1)
					hm.put(note[i], hm.get(note[i]) - 1);
				else
					hm.remove(note[i]);
			}
		}
		if(flag==0)
			System.out.println("No");
		else
			System.out.println("Yes");

	}
}

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);

		int n, m;
		String[] magazine;
		String[] note;
		System.out.print("Enter the number of words in the magazine : ");
		n = ip.nextInt();

		
		System.out.print("Enter the number of words in the note : ");
		m = ip.nextInt();

		System.out.print("Enter the words in the magazine : ");
		magazine = ip.next().split(" ");

		ip.nextLine();
		
		System.out.print("Enter the words in the note : ");
		note = ip.next().split(" ");

		new RandsomClass().randsom(magazine, note);

	}

}

import java.util.Scanner;

class Reckamann {
	public boolean isVisited(int ele, int[] rec) {
		for (int i = 0; i < rec.length; i++) {
			if (rec[i] == ele)
				return true;
		}
		return false;
	}

	public int[] solveReckamann(int n) {
		int i = 0;
		int[] rec = new int[n];
		int j = 1;						//to traverse the rec array
		rec[0] = 0;
		int hops = 1;
		while (j < n) {
			int backHopEle = i - hops;
			if (backHopEle <= -1 || isVisited(backHopEle, rec))// move forward
			{
				i = i + hops;

			} else {// move backwards
				i = i - hops;

			}
			hops++;
			rec[j] = i;
			j++;

		}
		return rec;
		
		//0 1 2 3 4 5 6 7 8 ...
		//i
		  
		//0
		//0 1 2 3 4 5 6 7 ...
		//j
	}
	
	public void display(int[] rec)
	{
		for(int i=0; i<rec.length; i++)
			System.out.print(rec[i] + " ");
	}
}

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		
		int n;
		System.out.println("Enter the value of n : ");
		n = ip.nextInt();
		
		Reckamann r = new Reckamann();
		r.display(r.solveReckamann(n));
		

	}

}

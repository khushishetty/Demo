package program13;

import java.util.Scanner;

class FibonacciClass{
	public int[] fibonacci(int n) {
		int[] fib = new int[n];

		fib[0] = 0;
		if (n == 1)
			return fib;
		fib[1] = 1;
		if (n == 2)
			return fib;
		for (int i = 3; i <= n; i++)
			fib[i - 1] = fib[i - 2] + fib[i - 3];
		return fib;
	}
	
	public void display(int[] n)
	{
		for(int i=0; i<n.length; i++)
			System.out.println(n[i]);
	}
}
public class Program13 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n : ");
		
		n = ip.nextInt();
		
		FibonacciClass fc = new FibonacciClass();
		int[] fib = fc.fibonacci(n);
		
		fc.display(fib);

	}

}

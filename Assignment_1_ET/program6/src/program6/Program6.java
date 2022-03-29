package program6;

import java.util.Scanner;

class Josephus {
	public void solveJosephus(int n)
	{
		int[] array = new int[n];
		for(int i=0; i<n; i++)
			array[i]=1;
		
		int num=n;
        
    	int i=0, j;
		while(num!=1)
		{
			if(array[i]==1 && num!=1)
			{
				j=(i+1)%n;
				while(array[j]!=1)
				{
					j = (j+1)%n;
				}
				if(array[j]==1 && num!=1)
				{
					array[j]=0;
					num--;
				}
			}
			i = (i+1)%n;
		}
		
        
		i=0;
		while(array[i]!=1 && i<n)
			i++;
		System.out.println("The " + (i+1) + " th person is alive!");
        	
		
		
	}

}

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.println("Enter the value of n : ");
		Scanner ip=new Scanner(System.in);
		
		n=ip.nextInt();

		Josephus j = new Josephus();

		j.solveJosephus(n);

	}

}

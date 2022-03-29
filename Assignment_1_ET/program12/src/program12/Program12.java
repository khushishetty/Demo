package program12;

public class Program12 {

	public static int power(int b, int e)
	{
		int res=b;
		for(int i=2; i<=e; i++)
		{
			res *= b;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(10, 3));
	}

}

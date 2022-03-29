package program_2;

import java.util.Scanner;

class ConverterClass{
	public char[] Converter(String s)
	{
		char[] ch = new char[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			ch[i] = s.charAt(i);
		}
		return ch;
	}
}
public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		String s;
		
		System.out.println("Enter the string : ");
		s = ip.nextLine();
		
		char[] ch = new ConverterClass().Converter(s);
		
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}

	}

}

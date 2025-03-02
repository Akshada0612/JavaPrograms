//spy,duck,buzz,sunny

import java.util.Scanner;
class DuckNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		String num=sc.next();

		if(num.charAt(0)=='0')
			System.out.println("Not duck no");
		else
		{
			if(num.contains("0"))
			System.out.println("Duck No");
			else
			System.out.println("Not duck no");	
		}
			
	}
}
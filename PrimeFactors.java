import java.util.Scanner;
class PrimeFactors 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
			if(
		}
	}
}

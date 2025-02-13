import java.util.Scanner;
class PrimeFactorsOfNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int den=2;
		
		for (int i=2;i<=num;i++ )
		{
			if(num%i==0)
			while(den<i)
		{
			if(i%den==0)
			{
				break;
			}
			den++;
		}
		if(i==den)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println();
		}
		
		}
		
	}
}

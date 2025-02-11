import java.util.Scanner;
class Prime1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if(num==den)
		{
			System.out.println("Prime");
		}else
		{
			System.out.println("Not Prime");
		}
	}
}

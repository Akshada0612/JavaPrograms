import java.util.Scanner;
class Emirp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int den=2;
		int rev=0;
		int dup=num;
		int sum;
		
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
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println(rev);
			sum=rev+dup;
				System.out.println("sum of numbers are: "+ sum);
				
				while(den<sum)
		     {
			if(sum%den==0)
			{
				break;
			}
			den++;
		    }
		if(sum==den)
			{
				System.out.println("It is Emirp Numer");
		    }else
			{
				System.out.println("It is not a Emirp Numer");
			}
			
		}else
		{
			System.out.println("Not Prime");
		}
	}
}

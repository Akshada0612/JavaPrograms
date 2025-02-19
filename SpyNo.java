import java.util.Scanner;
class SpyNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int mul=1;
		
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			sum=sum+rem;
		}
		System.out.println("Sum of number is:" + sum);
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			mul=mul*rem;
		}
		System.out.println("Product of no is:"+ mul);
		
		if(sum==mul)
			System.out.println("It is spy no");
		else
			System.out.println("It is not spy no");
	}
}

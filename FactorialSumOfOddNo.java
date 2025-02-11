import java.util.Scanner;
class FactorialSumOfOddNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2!=0)
			{
				int fact=1;
				for(int i=rem;i>=1;i--)
				{
					fact=fact*i;
					
				}
				sum=sum+fact;
			}
			num=num/10;
		}
		System.out.println("Sum of all even digit is:" + sum);
	}
}
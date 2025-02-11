import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 1000:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.println("sum of digits is:" + sum);
	}
}

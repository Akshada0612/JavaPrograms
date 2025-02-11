import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;
		while(num>0)
		{
			 
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(rev==dup)
		{
			System.out.println("It is Palindrome number");
		}else
		{
			System.out.println("It is not Palindrome");
		}
		
	}
}

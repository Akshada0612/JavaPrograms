import java.util.Scanner;
class BuzzNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num%7==0||num%10==7)
		{
			System.out.println("It is Buzz no");
		}else
		{
			System.out.println("It is not Buzz no");
		}
	}
}

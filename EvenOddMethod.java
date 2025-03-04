import java.util.Scanner;
class EvenOddMethod 
{
	public static void main(String[] args) 
	{
		evenodd();
	}
	public static void evenodd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}
}

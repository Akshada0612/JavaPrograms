import java.util.Scanner;
class If2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you paid money for class?");
		boolean ans=sc.nextBoolean();
		
		if(ans)
		{
			System.out.println("pay the fees");
		}
		System.out.println("do the class");
	}
}

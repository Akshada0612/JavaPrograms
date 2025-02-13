import java.util.Scanner;

class Fibonnaci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3,i;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(i=2;i<=range;++i)
		{
			n3 = n1 + n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}
}

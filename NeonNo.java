import java.util.Scanner;
class NeonNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int sq=num*num;
		int sum=0;
		
		
		for(int i=sq;i>0;i/=10)
		{
		
		sum+=(i%10);
		
		}
		System.out.println(sum);
		
		if(sum==num)
			System.out.println("Neon No");
		else
			System.out.println("Not Neon No");
			
	}
}

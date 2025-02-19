import java.util.Scanner;
class SunnyNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		boolean flag=true;
		int Nnum=num+1;
		
		for(int i=1;i<=Nnum;i++)
		{
			if(i*i==Nnum)
			{
				flag=true;
				System.out.println("It is sunny no");
			}
			else
			{
				flag=false;
				System.out.println("Not sunny number:");
				break;
			}
		
			
		}
		
	}
}

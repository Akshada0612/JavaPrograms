import java.util.Scanner;
class SqRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				flag=true;
				System.out.println(i +" is perfect squareroot of:"+num);
			}
			if(i*i>num)
				break;
		}
		if(!flag)
			System.out.println("It is not perfect squareroot");
	}
}

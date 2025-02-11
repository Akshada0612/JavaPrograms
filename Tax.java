import java.util.Scanner;
class Tax 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary:");
		long sal=sc.nextLong();
		
		if(sal<1200000)
		{
			System.out.println("No tax");
		}
		else if(sal>1200000 && sal<1600000)
		{
			System.out.println("Tax is allowed Total tax is:" + sal*0.15);
		}
		else if(sal>1600000 && sal<2100000)
		{
			System.out.println("Tax is allowed Total tax is:" + sal*0.20);
		}
		else if(sal>2100000 && sal<2400000)
		{
			System.out.println("Tax is allowed Total tax is:" + sal*0.25);
		}
		else if(sal>2400000)
		{
			System.out.println("Tax is allowed Total tax is:" + sal*0.30);
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}
}

import java.util.Scanner;
class Loops4 
{
	public static void main(String[] args) 
		throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String s=sc.next().toUpperCase();
		int len=s.length();
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(s.charAt(i));
			Thread.sleep(1000);
		}
	}
}

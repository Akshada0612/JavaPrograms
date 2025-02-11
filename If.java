import java.util.Scanner;
class If1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your bill amt:");
		
		double billAmt=sc.nextDouble();
		
		if(billAmt>2000)
		{
			billAmt-=(billAmt*0.1);
		}
		System.out.println("Your bill amt:" + billAmt);
	}
}

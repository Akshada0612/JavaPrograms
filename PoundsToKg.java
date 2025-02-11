import java.util.Scanner;
class PoundsToKg 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a weight in pounds: ");
		double pound=sc.nextDouble();
		double kg=pound*0.454;
		
		System.out.println("weight in kg is: " + kg);
	}
}

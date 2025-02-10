import java.util.Scanner;
class Bmi
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a weight in pounds:");
		double weight=sc.nextDouble();
		
		System.out.println("Enter a height in inches:");
		double height=sc.nextDouble();
		
		double w=weight*0.453359237;
		double h=height*0.0254;
		
		double bmi=w/(h*h);
		System.out.println("BMI is :" + bmi);
	}
}

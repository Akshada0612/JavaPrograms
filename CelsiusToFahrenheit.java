import java.util.Scanner;
class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in celsius:");
		double celsius=sc.nextDouble();
		
		double Fahrenheit=(9/5)*celsius+32;
		
		System.out.println("Temperature in celsius:" + celsius);
		System.out.println("Temperature in Fahrenheit:" + Fahrenheit);
	}
}


import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of cylinder:");
		double radius=sc.nextFloat();
		System.out.println("Enter length of cylinder:");
		double len=sc.nextFloat();
		
		double area=3.14*radius*radius;
		double volume=area*len;
		
		System.out.println("Area of cylinder is:" + area);
		System.out.println("Volume of cylinder is:" + volume);
		
	}
}

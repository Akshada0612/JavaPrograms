import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		float r=sc.nextFloat();
		final int pi=22/7;
		float area=pi*r*r;
		System.out.println("Area of circle of given radius is:" + area +"sq.cm");
	}
}

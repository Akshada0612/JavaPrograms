
import java.util.Scanner;
class MinToYears

{
	public static void main(String[] args) 
		
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Minutes:");
		
		long min=sc.nextLong();
		
		int year=365*24*60;
		int day=24*60;
	
		long tyear=min/year;
		
		long tday=min%year;
		long totalDay=tday/day;
		System.out.println(tyear);
		
		
		System.out.println("total year is:" + tyear + " and " + totalDay + " days");
		}
}

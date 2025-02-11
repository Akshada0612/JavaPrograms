import java.util.Scanner;
class Monsoon
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a month");
		String month=sc.next().toUpperCase;
		
		String ans=
		(month.equals("OCT"))||(month.equals("NOV"))||	
		(month.equals("DEC"))||(month.equals("JAN"))?month+" is WINTER":
		(month.equals("FEB"))||(month.equals("MAR"))||	
		(month.equals("APR"))||(month.equals("MAY"))?month+" is SUMMER":
		(month.equals("JUN"))||(month.equals("JUL"))||	
		(month.equals("AUG"))||(month.equals("SEP"))?month+" is MONSOON":
		"INVALID MONTH";
		
		System.out.println(ans);
	}
}

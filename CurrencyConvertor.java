import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Currency Convertor");
		System.out.println();
		System.out.println("Enter the Amount:");
		float inr=sc.nextFloat();
		System.out.println();
		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("5.ISL");
		System.out.println("6.AUD");
		System.out.println();
		System.out.println("Enter the currency:");
		String curr=sc.next().toUpperCase();
		float conCurr=0;
		if(curr.equals("USD"))
		{
			conCurr=inr/86.56f;
			System.out.println(inr + " "+ "INR" +" " + conCurr + " " + "USD");
		}
		if(curr.equals("EUR"))
		{
			conCurr=inr/90.25f;
			System.out.println(inr + "INR" + conCurr + "EUR");
		}
		if(curr.equals("GBP"))
		{
			conCurr=inr/107.65f;
			System.out.println(inr + "INR" + conCurr + "GBP");
		}
		if(curr.equals("PKR"))
		{
			conCurr=inr/0.309f;
			System.out.println(inr + "INR" + conCurr + "PKR");
		}
		if(curr.equals("ISL"))
		{
			conCurr=inr/23.89f;
			System.out.println(inr + "INR" + conCurr + "ISL");
		}
		if(curr.equals("AUD"))
		{
			conCurr=inr/86.56f;
			System.out.println(inr + "INR" + conCurr + "AUD");
		}
	}
}

import java.util.Scanner;
class BinaryNumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		System.out.println("num: "+ num);
		String bin=Integer.toBinaryString(num);
		System.out.println("bin : " +bin);
		int num2=Integer.parseInt(bin,2);
		System.out.println("num2 : "+ num2);
	}
}

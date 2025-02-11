import java.util.Scanner;
class Practice1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		String ans=((num%2==0)?("even"):("odd"));
		System.out.println(ans);
	}
}

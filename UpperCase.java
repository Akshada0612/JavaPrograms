import java.util.Scanner;
class UpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		String ans=((ch>='A' && ch<='Z')?(ch+" It is Uppercase"):(ch+" It is not Uppercase"));
		System.out.println(ans);
	}
}

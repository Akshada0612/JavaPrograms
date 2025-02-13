import java.util.Scanner;
class LowerCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		String ans=((ch>='a' && ch<='z')?(ch+" It is lowercase"):(ch+" It is not lowercase"));
		System.out.println(ans);
	}
}

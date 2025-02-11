import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=sc.next();
		String dup=str;
		int len=str.length();
		String rev=" ";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev==dup)
		{
			System.out.println("Palindrome String");
		}else
		{
			System.out.println("Not Palindrome String");
		}
	}
}

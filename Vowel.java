import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		char ch=sc.next().charAt(0);
		
		String ans=((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch + " It is vowel"):(ch + " It is consonents"));
		System.out.println(ans);
	}
}

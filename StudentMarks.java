import java.util.Scanner;
class StudentMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Marks:");
		int marks=sc.nextInt();
		
		int per=(marks*100)/600;
		System.out.println("Student percentage is:" + per);
		
		String ans=((per>=75 && per<=100)?("A class"):((per>=60 && per<=75)?("B class"):((per>=35 && per<=60)?("c class"):("fail"))));
		
		System.out.println(ans);
	}
}

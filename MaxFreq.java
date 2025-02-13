import java.util.Scanner;
class MaxFreq 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int maxcount=0;
		int maxdigit=0;
		
		while(num>0)
		{
			int digit=num%10;
			int count=0;
			int tempNum=num;
			
			while(tempNum>0)
			{
				if(tempNum%10==digit)
				{
					count++;
					
				}
				tempNum/=10;
				
			}
			if(count>maxcount)
			{
				maxcount=count;
				maxdigit=digit;
			}
			num/=10;
		}
		System.out.println("Digit with max freq:" + maxdigit);
		System.out.println("max freq:" + maxcount);
  }
}
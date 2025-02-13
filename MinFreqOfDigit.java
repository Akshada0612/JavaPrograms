import java.util.Scanner;
class MinFreqOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int mincount=Integer.MAX_VALUE;
		int mindigit=0;
		
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
			if(count<mincount)
			{
				mincount=count;
				mindigit=digit;
			}
			num/=10;
		}
		System.out.println("Digit with min freq:" + mindigit);
		System.out.println("min freq:" + mincount);
  }
}
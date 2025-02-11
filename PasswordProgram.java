import java.util.Scanner;
class PasswordProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		int storePin=1290;
		int seconds=5000;
		
		outerLoop:
			for (; ; )
			{
			int attempts=3;
			do
			{
				System.out.println("Enter your pin:");
				int pin=sc.nextInt();
				if(storePin==pin)
				{
					System.out.println("phone unlocked");
					break outerLoop;
				}else
				{
					System.out.println("wrong pin");
					System.out.println("Attempt left" + (attempts-1));
				}
				attempts--;
			}
			while (attempts>=1);
			System.out.println();
			System.out.println("Phone is disabled for " + (seconds/1000) + " seconds");
			Thread.sleep(seconds);
			seconds*=2;
			System.out.println();
			}
		
	}
}

class LargestNumber 
{
	public static void main(String[] args) 
	{
		int a=12;
		int b=56;
		int c=36;
		int largest=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		
		System.out.println("Largest number of above all numbers are:" + largest);
	}
}

class SmallestNumber 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=15;
		int c=46;
		int small=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("Smallest number of above all numbers are:"+ small);
	}
}

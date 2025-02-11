class  MaxDigitNo
{
	public static void main(String[] args) 
	{
		int num=234684321;
		int max=0;
		for(int i=num;i>0;i/=10)
		{
			int dgt=i%10;
			
			if(max<dgt)
				max=dgt;
		}
		System.out.println("largest digit is " + max);
	}
}

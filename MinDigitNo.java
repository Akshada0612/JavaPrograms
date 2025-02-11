class  MinDigitNo
{
	public static void main(String[] args) 
	{
		int num=234684321;
		int min=9;
		for(int i=num;i>0;i/=10)
		{
			int dgt=i%10;
			
			if(min>dgt)
				min=dgt;
		}
		System.out.println("smallest digit is " + min);
	}
}

class Pattern32
{
	public static void main(String[] args) 
	{
		int num=0;
		char ch='a';
		for (int i=1;i<=4 ;i++ )
		{
			for(int j=1;j<=i;j++)
			{
				if((i)%2!=0)
				System.out.print(num++ + " ");
				else
				System.out.print(ch++ + " ");	
			}
			System.out.println();
		}
		
	}
}
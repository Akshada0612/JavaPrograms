class Pattern22 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print( "*"+ " ");
			}
		System.out.println();	
		}
	
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(j<1)
				{
				System.out.print("");
				}else
				{
					System.out.print("*"+ " ");
				}
			
			}
			System.out.println();
		}
	}
}

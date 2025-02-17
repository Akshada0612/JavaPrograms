class Pattern21 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<n-i-1)
				{
					System.out.print(" ");
				}else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
			for(int i=0;i<n;i++)
		   {
			for(int j=0;j<i;j++)
			{
			System.out.print(" ");
			}
			for (int star=0;star<n-i ;star++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

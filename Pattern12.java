class Pattern12
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			int no=i;
			for (int j=0;j<=i;j++ )
			{
					System.out.print(no + "  ");
					no=no+5-j;
			}
			System.out.println();
		}
	}
}

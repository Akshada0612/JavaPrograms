class Pattern11
{
	public static void main(String[] args) 
	{
		int n=5,a=0;
		for(int i=1;i<=n;i++)
		{
			a=a+i;
			int b=a;
			for (int j=1;j<=i;j++)
			{
					System.out.print(a-- + " ");                                
			}
			a=b;
			System.out.println();
		}
	}
}

class Loops 
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		char c;
		for(c='A';c<='Z';c++)
		{
			System.out.print(c + " ");
		}
		System.out.println();
		
		char ch;
		for(ch='Z';ch>='A';ch--)
		{
		System.out.print(ch + " ");
		}
		System.out.println();
		
		char a;
		for(a='0';a<='9';a++)
		{
			System.out.print(a + " ");
		}
		System.out.println();
		
		int as;
		for(as='0';as<=127;as++)
		{
		System.out.print(as+":"+((char)as)+" ");
		}
	}
}

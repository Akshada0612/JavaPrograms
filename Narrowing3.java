class Narrowing3
{
	public static void main(String[] args) 
	{
		
		int i=65000;
		byte b=(byte)i;
		char c=(char)i;
		long l=(long)i;
	
	
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
		System.out.println(l);
	}
}
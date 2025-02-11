class Narrowing1 
{
	public static void main(String[] args) 
	{
		double d=35.678;
		float f=(float)d;
		int i=(int)d;
		byte b=(byte)d;
		char c=(char)d;
		long l=(long)d;
		System.out.println(d);
		System.out.println(f);
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
		System.out.println(l);
	}
}

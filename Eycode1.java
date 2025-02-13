class Eycode1 
{
	public static void main(String[] args) 
	{
		String str="00000000111101";
		System.out.println(str);
		boolean check0=str.contains("0000000");
		boolean check1=str.contains("1111111");
		System.out.println(check0||check1?"YES":"NO");
	}
}

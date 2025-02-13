class Eycode 
{
	public static void main(String[] args) 
	{
		String str="0111111100111";
		int cnt1=0;
		int cnt0=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='1')
			{
				cnt1++;
			}else if (ch=='0')
			{
				cnt0++;
			}
			else
			{
				cnt1=0;
				cnt0=0;
			}
			if(cnt1>=7||cnt0>=7)
			{
				break;
			}
		}
		System.out.println(cnt1>=7||cnt0>=7?"YES":"NO");
	}
}

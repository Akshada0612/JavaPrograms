class Census 
{
	public static void main(String[] args) 
	{
		long cp=312032486;
		long sec=(365*24*60*60)*5;
		long birth=sec/7;
		long death=sec/13;
		long im=sec/45;
		
		long np=cp+birth-death+im;
		
		System.out.println("Current population is:" + cp);
		System.out.println("New population will be after 5 years is:" + np);
	}
}

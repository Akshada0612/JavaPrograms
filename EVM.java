import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0, cng=0 , ss=0, aap=0, mns=0, nota=0;
		System.out.println();
		System.out.println("       WELCOME       ");
		System.out.println();
		System.out.println("Enter Population");
		int population=sc.nextInt();
		
		for (int i=0;i<=population;i++)
		{
			System.out.println();
			System.out.println("*****LIST OF PARTIES*****");
		    System.out.println("1.BJP");
			System.out.println("2.CNG");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println();
			System.out.println("Enter the option:");
			int opt=sc.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
				{
					bjp++;
					System.out.println("ACHE DIN AAYENGE");
				}
				
				if(opt==2)
				{
					cng++;
					System.out.println("BHARAT TODENGE");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if(opt==4)
				{
					aap++;
					System.out.println("AAZAD KARO");
				}
				if(opt==5)
				{
					mns++;
					System.out.println("JAY MAHARASHTRA");
				}
				if(opt==6)
				{
					nota++;
					System.out.println("YOU ARE EDUCATED PERSON");
				}
				
			}
			if(!(opt>=1 && opt<=6))
			    {
				i--;
				System.out.println("INVALID OPTION");
			    }
		}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns &&bjp>=nota)
			{
				System.out.println("BJP HAS WON THE ELECTIONS BY " + bjp +" votes");
			}
			if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("CNG HAS WON THE ELECTIONS BY " + cng +" votes");
			}
			if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("SS HAS WON THE ELECTIONS BY " + ss +" votes");
			}
			if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota)
			{
				System.out.println("AAP HAS WON THE ELECTIONS BY " + aap +" votes");
			}
			if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota)
			{
				System.out.println("MNS HAS WON THE ELECTIONS BY " + mns +" votes");
			}
			if(nota>=cng && nota>=ss && nota>=aap && nota>=mns && nota>=bjp)
			{
				System.out.println("NOTA HAS WON THE ELECTIONS BY " + nota +" votes");
			}
		}
		
	}


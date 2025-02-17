class Pattern16 
{
   public static void main(String[] args)
	{
        int n = 5; 
        int num1 = 1, num2 = 9, num3 = 10, num4 = 14, num5 = 15;
		for (int i = 1; i <= n; i++)
		{
            for (int j = 1; j <= i; j++)
			{
                if (j == 1)
					{
                    System.out.print(num1 + " ");
                    num1++;
                    } 
				else if (j == 2)
					{
                    System.out.print(num2 + " ");
                    num2--;
                    } 
				else if (j == 3) 
					{
                    System.out.print(num3 + " ");
                    num3++;
                    } 
				else if (j == 4)
					{
                    System.out.print(num4 + " ");
                    num4--;
                    } 
				else if (j == 5)
					{
                    System.out.print(num5 + " ");
                    num5--;
                    }
            }
            System.out.println();
        }
    }
}
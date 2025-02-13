
 class Series6
{
    public static void main(String[] args)
	{
        int n = 5;
        int term = 10;
        int diff = 20;

        System.out.print(term + " ");
        for (int i = 1; i < n; i++) {
            term += diff;
            System.out.print(term + " ");
            diff += (i == 1) ? 18 : (i == 2) ? 24 : 30;
        }
    }
}


class Series4
	{
    public static void main(String[] args) {
        int n = 6; 
        int firstTerm = 79;
        int[] differences = {29, 31, 37, 41, 43}; 

        int term = firstTerm;
        System.out.print(term + " ");

        for (int i = 0; i < n - 1; i++) {
            term += differences[i];
            System.out.print(term + " ");
        }
    }
}
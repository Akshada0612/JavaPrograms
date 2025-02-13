class Series5 
{
    public static void main(String[] args) {
        int n = 6;
        int term = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            if (i == 0) {
                term = term * 3;
            } else if (i == 1) {
                term = term * 3;
            } else {
                term = term * 3 + 3;
            }
        }
    }
}


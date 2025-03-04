class FactorialMethod {
    public static void main(String[] args) {
        int a = 6;
        int result = factorial(a);
        System.out.println(result);
    }

    public static int factorial(int n) {
        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i;  
        }
        return fact;
    }
}

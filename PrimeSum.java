import java.util.Scanner;
class PrimeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (int i = 2; i <= n / 2; i++) {
            boolean isIPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isIPrime = false;
                    break;
                }
            }

            boolean isNMinusIPrime = true;
            for (int j = 2; j <= (n - i) / 2; j++) {
                if ((n - i) % j == 0) {
                    isNMinusIPrime = false;
                    break;
                }
            }

            if (isIPrime && isNMinusIPrime) {
                System.out.println(n + " = " + i + " + " + (n - i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(n + " cannot be formed using the sum of two prime numbers.");
        }
    }
}
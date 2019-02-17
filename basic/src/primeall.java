import java.util.Scanner;

public class primeall {

    static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrime(int n, int m) {
        for (int i = n; n < m; n++) {
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int q = sc.nextInt();

        for (int i = t; i < q + 1; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}

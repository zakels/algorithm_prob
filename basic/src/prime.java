import java.util.Scanner;

public class prime {
    static boolean isPrime(int n) {
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (isPrime(t)) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}

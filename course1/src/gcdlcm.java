import java.util.Scanner;

public class gcdlcm {

    static int gcd(int a, int b) {
        int res = 1, range;
        if (a > b) {
            range = b;
        } else {
            range = a;
        }
        for (int i = range; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, lcm;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(gcd(a,b));
        lcm = a * b / gcd(a,b);
        System.out.println(lcm);
    }
}

import java.util.Scanner;

public class fibonacci {
    static int[] fibo;

    static double fiboDpWh(int n) {
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n-1] + fibo[n-2];
    }

    static int fiboDp(int n) { ;
        if (fibo[n] == -1) {
            if (n <= 1) {
                fibo[n] = n;
            } else {
                fibo[n] = fiboDp(n-1) + fiboDp(n-2);
            }
        }
        return fibo[n];
    }

    static double fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        fibo = new int[500];

        for (int i = 0; i < 500; i++) {
            fibo[i] = -1;
        }


        System.out.println(fiboDp(n));
    }
}

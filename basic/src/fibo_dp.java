import java.io.*;
import java.util.*;

public class fibo_dp {

    static double[] fibo;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        fibo = new double[1000];
        fibo[0] = 0;
        fibo[1] = 1;

        int t = sc.nextInt();

        for (int i = 2; i <= t; i++){
            fibo[i] = fibo[i-2] + fibo[i-1];
        }

        System.out.println(fibo[t]);


    }
}

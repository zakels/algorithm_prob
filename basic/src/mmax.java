import java.util.Scanner;

public class mmax {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, max = -1, index = 0;
        for(int i = 0; i < 9; i++) {
            t = sc.nextInt();
            if (t > max) {
                max = t;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}

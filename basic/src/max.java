import java.util.Scanner;

public class max {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, max = -1;
        for(int i = 0; i < 3; i++) {
            t = sc.nextInt();
            if (t > max) {
                max = t;
            }
        }
        System.out.println(max);
    }
}

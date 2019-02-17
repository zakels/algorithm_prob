import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yaksu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                l.add(i);
            }
        }



        try {
            System.out.print(l.get(b-1));
        } catch (Exception e) {
            System.out.print(0);
        }
    }
}

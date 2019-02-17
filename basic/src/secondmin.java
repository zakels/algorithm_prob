import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class secondmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();

        int t, min = 10000000, index = 0;
        for(int i = 0; i < 9; i++) {
            t = sc.nextInt();
            l.add(t);
            if (t < min) {
                min = t;
                index = i;
            }
        }

        int newMin = 10000000, newIndex = 0;
        for (int i = 0; i < 9; i++) {
            if (i != index) {
                if (l.get(i) < newMin) {
                    newMin = l.get(i);
                    newIndex = i;
                }
            }
        }
        System.out.println(newMin);
        System.out.println(newIndex + 1);
    }
}

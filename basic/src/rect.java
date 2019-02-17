import java.util.Scanner;

public class rect {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, res = 0;

        x = sc.nextInt();
        y = sc.nextInt();

        res = x * y;

        System.out.println(res);
    }

}

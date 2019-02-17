import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int a, b;
        String modifier;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        modifier = sc.next();
        b = sc.nextInt();

        if(modifier.contains("+")) {
            System.out.println(a+b);
        } else if (modifier.contains("-")) {
            System.out.println(a-b);
        } else if (modifier.contains("*")) {
            System.out.println(a*b);
        } else if (modifier.contains("/")) {
            System.out.println(a/b);
        }

    }
}

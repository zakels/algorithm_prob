import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a%2 == 0) {
            System.out.print("even");
        }  else {
            System.out.print("not even");
        }
    }
}

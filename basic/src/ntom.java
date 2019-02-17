import java.util.Scanner;

public class ntom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, count = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
            count++;
            if (count % 8 == 0 ) {
                System.out.println();
            }
        }
    }
}

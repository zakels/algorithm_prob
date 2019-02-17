import java.util.Scanner;

public class gugudan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            int x = n * i;
            System.out.print(n + "*" + i + "="+ x);
            System.out.println();
        }
    }
}

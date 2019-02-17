import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int c, d;
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println(arr[c][d]);

    }
}

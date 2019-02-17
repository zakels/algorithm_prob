import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] arr = new int[a][b];

        int cnt = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j ++) {
                arr[i][j] = cnt++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

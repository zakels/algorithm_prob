import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class eightnine {
    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("p2.txt"));
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] arr = new int[a][b];
        int[][] tmp = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = b - 1; j >= 0; j--) {
                arr[i][j] = sc.nextInt();
            }
        }



        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

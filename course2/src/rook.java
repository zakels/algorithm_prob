import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rook {

    static int checkHorizontal(int[][] a, int x, int y) {
        for (int i = y; i < 8; i++) {
            if (a[x][i] == 3) {
                break;
            } else if (a[x][i] == 1) {
                return 1;
            }
        }

        for (int i = y; i >= 0; i--) {
            if (a[x][i] == 3) {
                break;
            } else if (a[x][i] == 1) {
                return 1;
            }
        }

        return 0;
    }

    static int checkVertical(int[][] a, int x, int y) {
        for (int i = x; i < 8; i++) {
            if (a[i][y] == 3) {
                break;
            } else if (a[i][y] == 1) {
                return 1;
            }
        }

        for (int i = x; i >= 0; i--) {
            if (a[i][y] == 3) {
                break;
            } else if (a[i][y] == 1) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("rook.txt"));
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[8][8];
        int x = 0, y = 0;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 2) {
                    x = i;
                    y = j;
                }
            }
        }

        //System.out.println(x + " " + y);

        int h = 0, v = 0;

        h = checkHorizontal(arr, x, y);
        v = checkVertical(arr, x, y);

        if (h == 1 || v == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}

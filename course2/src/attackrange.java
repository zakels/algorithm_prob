import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class attackrange {
    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("attackrange.txt"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int range = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '0';
            }
        }

        arr[r][c] = 'x';


        int num = 1;
        for (int i = 0; i < range; i++) {
            if (c-num > -1) {
                arr[r][c - num] = (char) (num + '0');
            }
            if (c+num < n) {
                arr[r][c + num] = (char) (num + '0');
            }
            if (r-num > -1) {
                arr[r - num][c] = (char) (num + '0');
            }
            if (r+num < n) {
                arr[r + num][c] = (char) (num + '0');
            }

            if (i > 0) {
                int sum = num - 1, delta = 1;

                while (sum != 0) {
                    if (r-sum > -1 && c+delta < n) {
                        arr[r - sum][c + delta] = (char) (num + '0');
                    }
                    sum--;
                    delta++;
                }
                sum = num - 1; delta = 1;
                while (sum != 0) {
                    if (r+sum < n && c-delta > -1) {
                        arr[r + sum][c - delta] = (char) (num + '0');
                    }
                    sum--;
                    delta++;
                }
                sum = num - 1; delta = 1;
                while (sum != 0) {
                    if (r-sum > -1 && c-delta > -1) {
                        arr[r - sum][c - delta] = (char) (num + '0');
                    }
                    sum--;
                    delta++;
                }
                sum = num - 1; delta = 1;
                while (sum != 0) {
                    if (r+sum < n && c+delta > -1) {
                        arr[r + sum][c + delta] = (char) (num + '0');
                    }
                    sum--;
                    delta++;
                }
            }
            num++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}

import java.util.Scanner;

public class offset {
    static int[][] arr;

    static boolean compare(int i, int j) {
        if (i == 0 && j == 0) { //3
            if (arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i+1][j]) {
                return true;
            }
        } else if (i == 4 && j == 4) { //4
            if (arr[i][j] < arr[i-1][j] && arr[i][j] < arr[i][j-1]) {
                return true;
            }
        } else if (i == 4 && j == 0) { //2
            if (arr[i][j] < arr[i-1][j] && arr[i][j] < arr[i][j+1]) {
                return true;
            }
        } else if (i == 0 && j == 4) { //9
            if (arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i+1][j]) {
                return true;
            }
        } else if (i == 0) {
            if (arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i+1][j]) {
                return true;
            }
        } else if (j == 0) {
            if (arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i-1][j] && arr[i][j] < arr[i+1][j]) {
                return true;
            }
        } else if (i == 4) {
            if (arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i-1][j]) {
                return true;
            }
        } else if (j == 4) {
            if (arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i-1][j] && arr[i][j] < arr[i+1][j]) {
                return true;
            }
        } else {
            if (arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i][j+1] && arr[i][j] < arr[i+1][j] && arr[i][j] < arr[i-1][j]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!compare(i, j)) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}

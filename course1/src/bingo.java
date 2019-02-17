import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bingo {

    static boolean checkBingo(int[][] arr) {
        int bingoCnt = 0, d1_Bingo = 1, d2_Bingo = 1;
        for (int j = 0; j < 5; j++) {
            int xBingo = 1, yBingo = 1;
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != 0) {
                    yBingo = 0;
                }
                if (arr[j][i] != 0) {
                    xBingo = 0;
                }
            }
            if (xBingo == 1) {
                bingoCnt++;
            }
            if (yBingo == 1) {
                bingoCnt++;
            }

            if (arr[j][j] != 0) {
                d1_Bingo = 0;
            }

            if(arr[4-j][j] != 0) {
                d2_Bingo = 0;
            }
        }
        if (d1_Bingo == 1) {
            bingoCnt++;
        }
        if (d2_Bingo == 1) {
            bingoCnt++;
        }

        if (bingoCnt == 3) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) throws FileNotFoundException {
 //       System.setIn(new FileInputStream("p2.txt"));
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5;i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int numCalled, cnt = 1;
        while(cnt != 26) {
            numCalled = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i][j] == numCalled) {
                        arr[i][j] = 0;
                    }
                }
            }
            if (cnt >= 13) {
                if (checkBingo(arr)) {
                    System.out.println(cnt);
                    break;
                }
            }
            cnt++;
        }



//        for (int i = 0; i < 5;i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inout {

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("inout.txt"));
        Scanner sc = new Scanner(System.in);
        int [][] board = new int[10][10];

        int num;
        num = sc.nextInt();

        int cnt = 0;

        while(cnt != num) {
            for (int i = 0; i < 10; i++) {
                if (i != cnt) {
                    if (board[cnt][i] == 0) {
                        board[cnt][i] = 1;
                    } else {
                        board[cnt][i] = 0;
                    }
                    if (board[i][cnt] == 0) {
                        board[i][cnt] = 1;
                    } else {
                        board[i][cnt] = 0;
                    }
                } else {
                    if (board[cnt][cnt] == 0) {
                        board[cnt][cnt] = 1;
                    } else {
                        board[cnt][cnt] = 0;
                    }
                }
            }

            cnt++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        int[][] arr = new int[a][a];

        int cnt = 1, outCnt = 1;
        for (int i = 0; i < a; i++) {
            outCnt = outCnt+i;
            cnt = outCnt;
            for (int j = 0; j < a-i; j ++) {
                cnt += j + i;
                arr[i][j] = cnt;
                System.out.print(arr[i][j] + " ");

            }

            System.out.println();
        }
    }
}

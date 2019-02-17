import java.util.Scanner;

public class seat {
    static int[] res;

    static int[][] initSeat(int row, int col, int seatNum) {
        int[][] arr = new int[row][col];
        int i = row, j = 0;
        int new_x = 1, new_y = 1;

        int p, delta = 1, num = 1;
        while(true) {
            for (p = 0 ; p < row; p++) {
                i = i-delta;
                new_y += delta;
                if (num == seatNum) {res[0] = new_x; res[1] = new_y-1;}
                arr[i][j] = num;
                num++;
            }
            row--;
            col--;
            for (p = 0; p < col; p++) {
                j = j+delta;
                new_x += delta;
                if (num == seatNum) {res[0] = new_x; res[1] = new_y-1;}
                arr[i][j] = num;
                num++;
            }
            delta = -delta;

            if (row < 0 || col < 0) {
                break;
            }
        }
        return arr;
    }

//    static int[] locateNum(int[][] arr, int num) {
//        int[] res = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j] == num) {
//
//                }
//            }
//        }
//
//
//        return res;
//    }

    public static void main(String[] args) {
        int r, c, seatNum, seatTotal;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        r = sc.nextInt();
        seatNum = sc.nextInt();
        res = new int[2];
        seatTotal = r * c;
        int[][] arr = initSeat(r, c, seatNum);

//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int[] res = locateNum(arr, seatNum);
        if (seatNum > seatTotal) {
            System.out.println(0);
        } else {
            System.out.println(res[0] + " " + res[1]);
        }

    }

}

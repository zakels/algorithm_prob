import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tetris {


    static List<Integer> checkPos(int[][] a) {
        int r = a.length;
        int c = a[0].length;
//        System.out.println(r);
//        System.out.println(c);

        List<Integer> l = new ArrayList<>();


        for (int i = 0; i < c; i++) {
            int onePos = r;
            for (int k = r - 1; k >= 0; k--) {
                if (a[k][i] == 1) {
                    onePos = k;
                }
            }
            if (onePos > 3) {
                onePos--;
                if (a[onePos][i]==0 && a[onePos - 1][i]==0 && a[onePos - 2][i]==0 && a[onePos-3][i]==0){
                   int score = checkScore(a, onePos, i);
                   if (score == 0) {
                       l.add(0);
                       l.add(0);
                   } else {
                       l.add(i + 1);
                       l.add(score);
                   }
                }
            }

        }

        return l;
    }

    static int checkScore(int[][] a, int x, int y) {
        int r = a.length;
        int c = a[0].length;
        int score = 0;

        a[x][y] = 1;
        a[x-1][y] = 1;
        a[x-2][y] = 1;
        a[x-3][y] = 1;


        for (int i = 0; i < 4; i++) {
            int noScore = 1;
            for (int j = 0; j < c; j++) {
                if (a[x-i][j] != 1) {
                    noScore = 0;
                }
            }
            if (noScore == 1) {
                score++;
            }
        }

        a[x][y] = 0;
        a[x-1][y] = 0;
        a[x-2][y] = 0;
        a[x-3][y] = 0;


        return score;
    }


    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("p1.txt"));
        Scanner sc = new Scanner(System.in);
        int c, r;
        c = sc.nextInt();
        r = sc.nextInt();

        int[][] arr = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> l = checkPos(arr);

        int maxScoreIndex = 0, maxScore = -1;

//        for (int i = 1; i < l.size(); i = i*2+1) {
//            if (maxScore < l.get(i)) {
//                maxScore = l.get(i);
//                maxScoreIndex = i;
//            }
//        }

        //System.out.println(l);

        if (l.size() == 0){
            System.out.println(0 + " " + 0);
        } else {
            //System.out.println(l.get(maxScoreIndex-1) + " " + l.get(maxScoreIndex));
            System.out.println(l.get(0) + " " + l.get(1));
        }

    }
}

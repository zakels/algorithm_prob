import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class colorpaper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,y,w,h;
        int[][] arr = new int[102][102];
        List<int[]> l = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            y = sc.nextInt();
            x = sc.nextInt();

            x = 100 - x;

            w = sc.nextInt();
            h = sc.nextInt();
            int[] inn = new int[4];
            inn[0] = x;
            inn[1] = y;
            inn[2] = w;
            inn[3] = h;
            l.add(inn);

            for (int j = 0; j < w; j++) {
                //arr[x][y+j] = i;
                for (int k = 0; k < h; k++) {
                    arr[x-k][y+j] = i;
                }
            }
        }


        int[] nCnts = new int[n+1];
        int newX, newY, newH, newW, cnt;
        int p = 1;
        for (int t = 0; t < n ; t++) {
            newX = l.get(t)[0];
            newY = l.get(t)[1];
            newW = l.get(t)[2];
            newH = l.get(t)[3];
            cnt = 0;
            for (int j = 0; j < newW; j++) {
                for (int k = 0; k < newH; k++) {
                    if (arr[newX-k][newY+j] == p) {
                        cnt++;
                    }
                }
            }
            nCnts[t] = cnt;
            p++;
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int zz = 0; zz < n; zz++) {
            System.out.println(nCnts[zz]);
        }

    }
}

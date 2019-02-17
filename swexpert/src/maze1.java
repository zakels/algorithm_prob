import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class maze1 {
    private static char[][] map = new char[16][16];
    private static int[][] visit = new int[16][16];
    private static int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    private static int initX, initY, finX, finY;
    private static int found;

    static void dfs(int x, int y) {
        if (x < 0 || y < 0 || x > 15 || y > 15) {
            return;
        }

        if (x == finX && y == finY) {
            found = 1;
            return;
        }

        int deltaX, deltaY;

        for (int i = 0; i < 4; i++) {
            deltaX = x + dir[i][0];
            deltaY = y + dir[i][1];
            if(visit[deltaY][deltaX] == 0 && (map[deltaY][deltaX] == '0' || map[deltaY][deltaX] == '3')) {
                visit[deltaY][deltaX] = 1;
                dfs(deltaY, deltaX);
                visit[deltaY][deltaX] = 0;
            }
        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("maze1.txt"));
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            found = 0;
            int testNum = sc.nextInt();
            initX = 0; initY = 0; finX = 0; finY = 0;

            for (int j = 0; j < 16; j++) {
                String x = sc.next();
                char[] a = x.toCharArray();
                for (int k = 0; k < 16; k++) {
                    if (a[k] == '2') {
                        initX = k;
                        initY = j;
                    }
                    if (a[k] == '3') {
                        finX = k;
                        finY = j;
                    }
                    map[j][k] = a[k];
                }
            }
            dfs(initX, initY);
            System.out.println("#" + testNum + " " + found);
        }

    }
}

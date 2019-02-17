import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maxofarr {
    static int max;
    static List<Integer> list;

    static void findMax(int[][] arr) {
        max = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 8; j >= 0; j--) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    list.add(i);
                    list.add(j);
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("maxofarr.txt"));
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        findMax(arr);

        System.out.println(max);
        int r, c;
        r = list.get(list.size()-2) + 1;
        c = list.get(list.size()-1) + 1;

        System.out.println(r + " " + c);

    }
}

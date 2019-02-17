import java.util.Scanner;

public class binary {

    static int powerOfTwo(int n){
        if(n == 0) {
            return 1;
        }
        return 2 * powerOfTwo(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, tmp;
        i = sc.nextInt();
        tmp = i;
        int cnt = 0;
        while(tmp > 0) {
            tmp = tmp/2;
            cnt++;
        }

        for (int j= cnt-1; j >= 0; j--) {
            if (i >= powerOfTwo(j)) {
                System.out.print(1);
                i -= powerOfTwo(j);
            } else {
                System.out.print(0);
            }
        }


        //System.out.print(cnt);
    }
}

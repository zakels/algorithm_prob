import java.util.Scanner;

public class cardgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int winA, winB;
        winA = winB = 0;
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i]=sc.nextInt();
        }
        for (int j = 0; j < 10; j++){
            b[j]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                winA++;
            } else if (a[i] < b[i]){
                winB++;
            }
        }
        System.out.print(winA + " " + winB);

        if (winA > winB) {
            System.out.print("A");
        } else if (winA == winB){
            System.out.print("D");
        } else {
            System.out.print("B");
        }


    }
}

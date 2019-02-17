import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            dq.push(x);
        }
        for (int i = 0; i < a; i++) {
            System.out.print(dq.pop() + " ");
        }

    }
}

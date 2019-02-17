import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, res;
        a = sc.nextInt();
        b = sc.nextInt();
        res = b;

        List<Integer> l = new ArrayList<>();
//        for (int i = res; i < 10; i++) {
//            l.add(i);
//        }
//        for (int i = 1; i < res; i++) {
//            l.add(i);
//        }

        int index = b - 1;
        int multiplier = 1;

        for (int i = 1; i < 10; i++) {
            l.add(i);
        }


        //System.out.println(l);


        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                if (i != 0) {
                    index += i * 2 + 1;
                }
            } else {
                if (i != 1) {
                    index += i * 2 + 1;
                }
            }

            for (int j = 0; j < a-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                if (i % 2 != 0) {
                    index = index%10;
                    if (index == 9) {
                        index = 0;
                    }
                    System.out.print(l.get(index));
                    index++;
                } else {
                    if (index < 0) {
                        index = index%10;
                    }
                    if (index == 9) {
                        index = 0;
                    }
                    //System.out.println(index);
                    System.out.print(l.get(index));
                    if (i == 0) {
                        index += 2;
                    }
                    index--;

                }
//                if (index < 9) {
//                    System.out.print(l.get(index));
//                    index++;
//                } else {
//                    index -= 9;
//                    System.out.print(l.get(index));
//                    index++;
//                }
            }
            System.out.println();
        }
    }
}

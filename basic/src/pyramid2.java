import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pyramid2 {

    public static int findIndexProceedBack(int endIndex, int by) {

        //int targetIndex = endIndex + 1;
        int index;
        index = endIndex;
        if (index == 10) {
            index = 1;
        }

        for (int i = 0; i < by; i++) {
            index++;
            if (index == 10) {
                index = 1;
            }
        }

        return index;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        List<Integer> l = new ArrayList<>();
        l.add(0);
        int index = b;
        int oddEndIndex = 0, evenStartIndex = index;

        for (int i = 1; i < 10; i++) {
            l.add(i);
        }


        //System.out.println(l);


        for (int i = 0; i < a; i++) {

            if (i != 0 ) {
                if (i % 2 == 0) { // even
                    //System.out.println(oddEndIndex);
//                    if (oddEndIndex - (i*2+1) >= 0) {
//                        oddEndIndex++;
//                    }
                    index = findIndexProceedBack(oddEndIndex, i*2+1);
                    //System.out.println(index);
                } else { //odd
                    index = evenStartIndex + 1;
                }
            }

            for (int j = 0; j < a-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                if (i % 2 != 0) { //odd row
                    if (index == 10) {
                        index = 1;
                    }
                    System.out.print(l.get(index));
                    oddEndIndex = index;
                    index++;
                } else { //even row
                    //Save starting index of even row for odd start
                    if (k == 0) {
                        evenStartIndex = index;
                    }
                    if (index == 0) {
                        index = 9;
                    }
                    System.out.print(l.get(index));
                    index--;
                }

            }
            System.out.println();
        }
    }
}

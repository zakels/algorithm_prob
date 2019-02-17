import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baseball {

    static boolean contains(final int[] a, final int num) {
        for (final int i : a) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("baseball.txt"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        int[] array = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (i != j && j != k && i != k) {
                        int[] combination = new int[3];
                        combination[0] = array[i];
                        combination[1] = array[j];
                        combination[2] = array[k];
                        list.add(combination);
                    }
                }
            }
        }

        List<int[]> guesses = new ArrayList<>();
        List<int[]> sb = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            int dd = sc.nextInt();
            String s = Integer.toString(dd);
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = s.charAt(i) - '0';
            }
            int[] sbarr = new int[2];
            sbarr[0] = sc.nextInt();
            sbarr[1] = sc.nextInt();

            guesses.add(arr);
            sb.add(sbarr);
        }

        int strikes, balls, i = 0;
        int first, second, third;
        while (i < n) {
            int size = list.size();
            strikes = sb.get(i)[0];
            balls = sb.get(i)[1];
            first = guesses.get(i)[0];
            second = guesses.get(i)[1];
            third = guesses.get(i)[2];

            if (balls == 0 && strikes == 0) {
                //System.out.println("OUT");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (contains(list.get(p), first) || contains(list.get(p), second) || contains(list.get(p), third)) {
                        list.remove(p);
                    } else {
                        p++;
                    }
                }
                //System.out.println(list.size());
            } else if (balls == 1 && strikes == 0) {
                //System.out.println("ONE BALL");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] != first && contains(list.get(p), first) && !contains(list.get(p), second) && !contains(list.get(p), third)) {
                        p++;
                    } else if (list.get(p)[1] != second && contains(list.get(p), second) && !contains(list.get(p), first) && !contains(list.get(p), third)) {
                        p++;
                    } else if (list.get(p)[2] != third && contains(list.get(p), third) && !contains(list.get(p), first) && !contains(list.get(p), second)) {
                        p++;
                    } else {
                        list.remove(p);
                    }
                }
            } else if (balls == 2 && strikes == 0) {
                //System.out.println("TWO BALLS");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] != first && list.get(p)[1] != second && contains(list.get(p), first) && contains(list.get(p), second) && !contains(list.get(p), third)) {
                        p++;
                    } else if (list.get(p)[0] != first && list.get(p)[2] != third && contains(list.get(p), first) && contains(list.get(p), third) && !contains(list.get(p), second)) {
                        p++;
                    } else if (list.get(p)[1] != second && list.get(p)[2] != third && contains(list.get(p), second) && contains(list.get(p), third) && !contains(list.get(p), first)) {
                        p++;
                    } else {
                        list.remove(p);
                    }
                }
            } else if (balls == 3 && strikes == 0) {
                //System.out.println("THREE BALLS");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (!contains(list.get(p), first) || !contains(list.get(p), second) || !contains(list.get(p), third)) {
                        list.remove(p);
                    } else if (list.get(p)[0] == first || list.get(p)[1] == second || list.get(p)[2] == third) {
                        list.remove(p);
                    } else {
                        p++;
                    }
                }
            } else if (strikes == 1 && balls == 0) {
                //System.out.println("ONE STRIKE");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] == first && list.get(p)[1] != second && list.get(p)[2] != third && (!contains(list.get(p), second) && !contains(list.get(p), third))) {
                        p++;
                    } else if (list.get(p)[1] == second && list.get(p)[0] != first && list.get(p)[2] != third && (!contains(list.get(p), first) && !contains(list.get(p), third))) {
                        p++;
                    } else if (list.get(p)[2] == third && list.get(p)[0] != first && list.get(p)[1] != second && (!contains(list.get(p), second) && !contains(list.get(p), first))) {
                        p++;
                    } else {
                        list.remove(p);
                    }
                }
                //System.out.println(list.size());
            } else if (strikes == 2 && balls == 0) {
                //System.out.println("TWO STRIKES");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] == first && list.get(p)[1] == second && !contains(list.get(p), third)) {
                        p++;
                    } else if (list.get(p)[0] == first && list.get(p)[2] == third && !contains(list.get(p), second)) {
                        p++;
                    } else if (list.get(p)[1] == second && list.get(p)[2] == third && !contains(list.get(p), first)) {
                        p++;
                    } else {
                        list.remove(p);
                    }
                }
            } else if (strikes == 3 && balls == 0) {
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] == first && list.get(p)[1] == second && list.get(p)[2] == third) {
                        p++;
                    } else {
                        list.remove(p);
                    }
                }
            } else if (balls == 1 && strikes == 1) {
                //System.out.println("ONE STRIKE ONE BALL");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] == first && list.get(p)[1] != second && list.get(p)[2] != third && (contains(list.get(p), second) || contains(list.get(p), third))) {
                        if (contains(list.get(p), second) && contains(list.get(p), third)) {
                            list.remove(p);
                        } else {
                            p++;
                        }
                    } else if (list.get(p)[1] == second && list.get(p)[0] != first && list.get(p)[2] != third && (contains(list.get(p), first) || contains(list.get(p), third))) {
                        if (contains(list.get(p), first) && contains(list.get(p), third)) {
                            list.remove(p);
                        } else {
                            p++;
                        }
                    } else if (list.get(p)[2] == third && list.get(p)[0] != first && list.get(p)[1] != second && (contains(list.get(p), first) || contains(list.get(p), second))) {
                        if (contains(list.get(p), first) && contains(list.get(p), second)) {
                            list.remove(p);
                        } else {
                            p++;
                        }
                    } else {
                        list.remove(p);
                    }
                }
                //System.out.println(list.size());
            } else if (balls == 2 && strikes == 1) {
                //System.out.println("ONE STRIKE TWO BALLS");
                int p = 0;
                for (int x = 0; x < size;x++) {
                    if (list.get(p)[0] == first && list.get(p)[1] != second && list.get(p)[2] != third && (contains(list.get(p), second) && contains(list.get(p), third))) {
                        p++;
                    } else if (list.get(p)[1] == second && list.get(p)[0] != first && list.get(p)[2] != third && (contains(list.get(p), first) && contains(list.get(p), third))) {
                        p++;
                    } else if (list.get(p)[2] == third && list.get(p)[0] != first && list.get(p)[1] != second && (contains(list.get(p), first) && contains(list.get(p), second))) {
                        p++;
                    } else {
                        list.remove(p);
                    }
                }
                //System.out.println(list.size());
            }

            i++;
        }
        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(list.get(j)[k]);
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(list.size());

    }


}

import java.util.*;

public class representnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> hm = new HashMap<>();
        int a, total = 0;
        for(int i = 0; i < 10; i++) {
            a = sc.nextInt();
            if (!hm.containsKey(a)) {
                hm.put(a, 0);
            } else {
                int newValue = hm.get(a)+1;
                hm.put(a, newValue);
            }
            total += a;
        }
        int maxValue = Collections.max(hm.values());
        int smallerKey = 1000;

        System.out.println(total/10);
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxValue) {
                if (entry.getKey() < smallerKey) {
                    smallerKey = entry.getKey();
                }
            }
        }
        System.out.println(smallerKey);
    }
}

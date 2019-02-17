import java.util.*;

public class dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int money = 0;
            for (int j = 0; j < 3; j++) {
                int b = sc.nextInt();
                if (!map.containsKey(b)) {
                    map.put(b, 0);
                } else {
                    map.put(b, map.get(b) + 1);
                }
            }
            //all different
            if (map.size() == 3) {
                int maxKey = 0;
                for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    if (entry.getKey() > maxKey) {
                        maxKey = entry.getKey();
                    }
                }
                money = maxKey*100;
                l.add(money);
            } else if (map.size() == 1){
                int key = 0;
                for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    key = entry.getKey();
                }
                money = key * 1000 + 10000;
                l.add(money);
            } else {
                int maxValues = Collections.max(map.values());
                int diceNum = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(entry.getValue() == maxValues) {
                        diceNum = entry.getKey();
                    }
                }
                money = diceNum * 100 + 1000;
                l.add(money);
            }
        }
        System.out.println(Collections.max(l));

    }
}

package day20;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/22 8:06
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        int[] gifts = {1, 2, 3, 2, 2};
        Main m = new Main();
        System.out.println(m.getValue(gifts, 5));
    }

    public int getValue(int[] gifts, int n) {
        // write code here
        int sign = n / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = gifts[i];
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > sign) {
                return entry.getKey();
            }
        }
        return 0;
    }
}

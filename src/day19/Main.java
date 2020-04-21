package day19;

import java.util.*;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/21 15:37
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int flag = input.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String key = input.next();
            int val = input.nextInt();
            map.put(key, val);
        }

        HashMap<String, Integer> m = sortHashmap(map, flag);
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> sortHashmap(HashMap<String, Integer> map, int flag) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (flag == 0) {
                    return o2.getValue() - o1.getValue();

                } else {
                    return o1.getValue() - o2.getValue();
                }
            }
        });
        HashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
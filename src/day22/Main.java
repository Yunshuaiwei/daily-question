package day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/23 16:51
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        HashMap<Character, Integer> str2Map = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str2Map.containsKey(c)) {
                Integer val = str2Map.get(c);
                str2Map.put(c, val + 1);
            } else {
                str2Map.put(c, 1);
            }
        }
        HashMap<Character, Integer> str1Map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2Map.containsKey(c)) {
                if (str1Map.containsKey(c)) {
                    Integer val = str1Map.get(c);
                    str1Map.put(c, val + 1);
                } else {
                    str1Map.put(c, 1);
                }
            }
        }
        int count = 0;
        String res = "Yes";
        for (Map.Entry<Character, Integer> entry : str2Map.entrySet()) {
            Character str2Key = entry.getKey();
            if (str1Map.containsKey(str2Key)) {
                if ((str2Map.get(str2Key).equals(str1Map.get(str2Key)))
                        || str1Map.get(str2Key) > str2Map.get(str2Key)) {
                    res = "Yes";
                }
            } else {
                res = "No";
            }
            if ("No".equals(res)) {
                break;
            }
        }
        if ("Yes".equals(res)) {
            System.out.println(res + " " + (str1.length() - str2.length()));
        } else {
            for (Map.Entry<Character, Integer> entry : str2Map.entrySet()) {
                Character key = entry.getKey();
                if (str1Map.containsKey(key)) {
                    if (str2Map.get(key) > str1Map.get(key)) {
                        count += (str2Map.get(key) - str1Map.get(key));
                    }
                } else {
                    count++;
                }
            }
            System.out.println(res + " " + count);
        }
    }
}
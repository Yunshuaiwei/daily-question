package day19;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/21 14:54
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Main1 m = new Main1();
        String[] p = {"ab", "b", "c", "d"};

        boolean[] str = m.chkSubStr(p, 4, "abc");
        System.out.println(Arrays.toString(str));

    }

    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            String str = p[i];
            if (str.length() == 1) {
                for (int j = 0; j < s.length(); j++) {
                    String c = s.charAt(j) + "";
                    if (str.equals(c)) {
                        result[i] = true;
                        break;
                    }
                }
            } else {
                result[i] = subString(str, s, 0, str.length());
            }
        }
        return result;
    }

    public boolean subString(String str, String s, int begin, int end) {
        if (end > s.length()) {
            return false;
        }
        String a = "";
        for (int j = begin; j < end; j++) {
            a += s.charAt(j);
        }
        if (a.equals(str)) {
            return true;
        }
        return subString(str, s, begin + 1, end + 1);
    }
}

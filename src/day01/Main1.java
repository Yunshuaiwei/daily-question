package day01;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/3/31 14:43
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        input.close();
        int count = 0;
        for (int i = 0; i <= a.length(); i++) {
            StringBuilder builder = new StringBuilder(a);
            StringBuilder str = builder.insert(i, b);
            boolean check = check(str.toString());
            if (check) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * 检测字符串是否是回文串
     *
     * @param s 目标字符串
     * @return 是则返回true，否则返回false
     */
    public static boolean check(String s) {
        for (int i = 0; i < s.length() / 2 - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

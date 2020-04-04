package day04;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/4 18:10
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        StringBuilder str1b = new StringBuilder(str1);
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            while (str1b.indexOf(c + "") != -1) {
                str1b.deleteCharAt(str1b.indexOf(c + ""));
            }
        }
        System.out.println(str1b.toString());
    }
}

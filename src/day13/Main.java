package day13;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/13 17:08
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String c = input.next();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += c;
        }
        int i = Math.round(n / 2);
        System.out.println(str);
        for (int j = 0; j < i - 1; j++) {
            System.out.print(c);
            for (int k = 1; k < str.length() - 1; k++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
        System.out.println(str);
    }
}

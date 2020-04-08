package day07;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/7 17:19
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println((a * b) / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        int d = 0;
        while (true) {
            d = a % b;
            if (d == 0) {
                return b;
            } else {
                int k = b;
                a = b;
                b = d;
            }
        }
    }
}

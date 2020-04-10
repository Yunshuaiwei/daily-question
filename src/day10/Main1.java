package day10;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/9 16:32
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        while (true) {
            a[2] = a[0] + a[1];
            a[0] = a[1];
            a[1] = a[2];
            int n2 = n - a[2];
            if (n2 < 0) {
                break;
            }
        }
        System.out.println(Math.min(n - a[0], a[1] - n));
    }
}

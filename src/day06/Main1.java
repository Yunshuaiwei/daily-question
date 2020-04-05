package day06;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/5 17:11
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.close();
        int A = (a + c) >> 1;
        int B = (b + d) >> 1;
        int C = d - B;
        if (((A - B) == a) && ((B - C) == b) && ((A + B) == c) && ((B + C) == d)) {
            System.out.println(A + " " + B + " " + C);
        } else {
            System.out.println("No");
        }
    }
}

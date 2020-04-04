package day04;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/4 17:56
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <= n / 6; i++) {
            for (int j = 0; j <= n / 6; j++) {
                if (i * 6 + 8 * j == n) {
                    System.out.println(i + j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

}

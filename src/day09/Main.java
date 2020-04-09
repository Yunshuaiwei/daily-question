package day09;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/9 15:18
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countOf(n));
    }

    public static long countOf(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j % 5 == 0) {
                count++;
                j /= 5;
            }
        }
        return count;
    }
}

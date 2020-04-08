package day08;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/8 19:00
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] mark = new int[n];
        for (int i = 0; i < n; i++) {
            mark[i] = 0;
        }
        input.close();
        int flag = n;
        int index = -1;
        int m = 3;
        do {
            while (m != 0) {
                index = (index + 1) % n;
                if (mark[index] == 0) {
                    m--;
                }
            }
            mark[index] = 1;
            flag--;
            m = 3;
        } while (flag != 1);
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == 0) {
                System.out.println(i);
            }
        }
    }
}

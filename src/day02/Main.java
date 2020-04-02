package day02;

import java.util.Scanner;

/**
 * @author DELL
 * @Date 2020/4/1 14:00
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            n = input.nextInt();
            if (n == 0) {
                break;
            }
            int last = 0;
            int num = 0;
            while (true) {
                //可以换tmp瓶水
                int tmp = n / 3;
                last = n % 3;
                n = last + tmp;
                num += tmp;
                if (n == 2) {
                    num += 1;
                    break;
                }
                if (n == 0 || n == 1) {
                    break;
                }
            }
            System.out.println(num);
        }
    }

}

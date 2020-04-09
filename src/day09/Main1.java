package day09;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/9 14:52
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        for (int i = num.length() - 1; i >= 0; i--) {
            System.out.print(num.charAt(i));
        }
    }
}

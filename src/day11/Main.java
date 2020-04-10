package day11;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/10 18:33
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - 48;
            arr[j]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i + ":" + arr[i]);
            }
        }
    }
}

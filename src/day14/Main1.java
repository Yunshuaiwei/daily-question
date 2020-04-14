package day14;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/14 14:58
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] str = line.split(" ");
        String res = "";
        for (int i = 1; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            while (n > 0) {
                res += i;
                n--;
            }
        }
        int n = Integer.parseInt(str[0]);
        StringBuilder builder = new StringBuilder(res);
        while (n > 0) {
            builder.insert(1, 0);
            n--;
        }
        System.out.println(builder.toString());
    }
}

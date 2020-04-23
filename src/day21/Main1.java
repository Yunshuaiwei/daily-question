package day21;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/23 15:46
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String cipher = input.nextLine();
            StringBuffer buffer = new StringBuffer(cipher);
            for (int i = 0; i < cipher.length(); i++) {
                char c = cipher.charAt(i);
                if (c == ' ') {
                    continue;
                } else {
                    if (c - 5 >= 65) {
                        buffer.setCharAt(i, (char) (c - 5));
                    } else {
                        buffer.setCharAt(i, (char) ((c - 65 - 4) + 90));
                    }
                }
            }
            System.out.println(buffer.toString());
        }
    }
}

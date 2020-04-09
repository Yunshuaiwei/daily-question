package day08;

import java.util.ArrayList;
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
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            int n = input.nextInt();
            if (n > 1000) {
                n = 999;
            }
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int index = 0;
            while (list.size() != 1) {
                index = (index + 2) % list.size();
                list.remove(index);
            }
            System.out.println(list.remove(0));
        }
    }
}

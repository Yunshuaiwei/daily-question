package day08;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/8 21:01
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != ' ') {
                s += num.charAt(i);
                continue;
            }
            list.add(Integer.parseInt(s));
            s = "";
        }
        list.add(Integer.parseInt(s));
        Integer k = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
        while (k > 0) {
            System.out.print(queue.poll() + " ");
            k--;
        }
    }
}

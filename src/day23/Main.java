package day23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/25 19:05
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A1 = 0;
        ArrayList<Integer> A2 = new ArrayList<>();
        int count = 0;
        ArrayList<Integer> A3 = new ArrayList<>();
        ArrayList<Integer> A4 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            if (num % 5 == 0 && num % 2 == 0) {
                A1 += num;
            } else if (num % 5 == 1) {
                A2.add(num);
            } else if (num % 5 == 2) {
                count++;
            } else if (num % 5 == 3) {
                A3.add(num);
            } else if (num % 5 == 4) {
                A4.add(num);
            }
        }
        int result = 0;
        for (int i = 0; i < A2.size(); i++) {
            Integer n = A2.get(i);
            if (i % 2 != 0) {
                n = (-n);
            }
            result += n;
        }
        int a3 = 0;
        for (int i = 0; i < A3.size(); i++) {
            a3 += A3.get(i);
        }
        if (A4.size() != 0) {
            A4.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }
        if (A1 != 0) {
            System.out.print(A1 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (result != 0) {
            System.out.print(result + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (count != 0) {
            System.out.print(count + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (a3 != 0) {
            float i = a3 / (float) A3.size();
            System.out.printf("%.1f ", i);
        } else {
            System.out.print("N" + " ");
        }
        if (A4.get(0) != null) {
            System.out.print(A4.get(0));
        } else {
            System.out.print("N");
        }
    }
}

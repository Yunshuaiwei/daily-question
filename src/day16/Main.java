package day16;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/16 14:46
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] arr = new int[2 * n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int[] ints = shuffle(arr, k);
            print(ints, T);
            T--;
        }
    }

    /**
     * 洗牌
     *
     * @return java.lang.String 返回洗好之后的结果
     * @Param [n, k]
     **/
    public static int[] shuffle(int[] arr, int k) {
        final int MID = arr.length / 2;
        int[] left = new int[MID];
        int[] right = new int[MID];
        while (k > 0) {
            for (int i = 0; i < MID; i++) {
                left[i] = arr[i];
                right[i] = arr[i + MID];
            }
            int j = arr.length - 1;
            for (int i = MID - 1; i >= 0; i--) {
                arr[j--] = right[i];
                arr[j--] = left[i];
            }
            k--;
        }
        return arr;
    }

    /**
     * 打印
     *
     * @return void
     * @Param [ints, k]
     **/
    public static void print(int[] ints, int k) {
        for (int i = 0; i < ints.length; i++) {
            if (k == 1 && i == ints.length - 1) {
                System.out.print(ints[i]);
            } else {
                System.out.print(ints[i] + " ");
            }
        }
    }
}

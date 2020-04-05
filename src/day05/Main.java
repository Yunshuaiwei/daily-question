package day05;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/4 18:37
 * @Version
 **/
public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <=n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        input.close();
        count(arr,40,n);
        System.out.println(count);
    }
    /**
     *
     * @Param [arr, s, n] arr存放物品的权重，s表示剩余可以装物品的容量
     *        n表示可以选择的物品个数
     * @return void
     **/
    public static void count(int[] arr, int s, int n) {
        if (s == 0) {
            count++;
            return;
        }
        if (s < 0 || (s > 0 && n < 1)) {
            return;
        }
        count(arr, s - arr[n], n - 1);
        count(arr, s, n - 1);
    }
}

package DS_Exam;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/24 18:24
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        while (true) {
            arr[2] = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = arr[2];
            if (n - arr[2] < 0) {
                break;
            }
        }
        int min = Math.min(n - arr[0], arr[1] - n);
        System.out.println(min);
    }
}

package day05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/4 18:37
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += arr[i] + arr[j];
                if (sum == 40) {
                    count++;
                    continue;
                }
                int k = j;
                while ((k+1 < n) && sum < 40) {
                    sum += arr[k];
                    if (sum == 40) {
                        count++;
                        continue;
                    }
                    if (sum > 40) {
                        break;
                    }
                    k++;
                }
                sum = 0;
            }
        }
        System.out.println(count);
    }
}

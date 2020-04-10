package day10;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/9 16:01
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        Main main = new Main();

    }

    public static int countWays(int x, int y) {
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 1; i <= x; i++) {
            dp[i][1] = 1;//初始化为1
        }
        for (int i = 1; i <= y; i++) {
            dp[1][i] = 1;//初始化为1
        }
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= y; j++) {
                //动态规划方程
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[x][y];
    }
}

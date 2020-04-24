package day21;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/23 14:45
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int i = input.nextInt();
            System.out.println(Main.getTotalCount(i));
        }
    }

    public static int getTotalCount(int monthCount) {
        if (monthCount == 1 || monthCount == 2) {
            return 1;
        }
        return getTotalCount(monthCount - 1) + getTotalCount(monthCount - 2);
    }
}

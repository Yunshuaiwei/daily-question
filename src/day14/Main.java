package day14;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/14 15:44
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Main main = new Main();
        System.out.println(main.getSequeOddNum(num));
    }

    public String getSequeOddNum(int m) {
        int num = getFirstNum(m);
        String str = "";
        str += num;
        while (m > 1) {
            str += "+";
            num += 2;
            str += num;
            m--;
        }
        return str;
    }

    /**
     * 得到每一个表达式的第一个数
     *
     * @return int
     * @Param [m]
     **/
    private int getFirstNum(int m) {
        if (m == 1) {
            return 1;
        }
        return (m - 1) * 2 + getFirstNum(m - 1);
    }
}

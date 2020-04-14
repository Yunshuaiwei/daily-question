package day13;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/13 17:53
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        Main1 main1 = new Main1();
        input.close();
        System.out.println(main1.AddLongInteger(str1, str2));
    }

    public String AddLongInteger(String addend, String augend) {
        String str1;
        String str2;
        if (addend.length() > augend.length()) {
            str1 = addend;
            str2 = augend;
        } else {
            str1 = augend;
            str2 = addend;
        }
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        int flag = 0;
        int index = sb1.length() - 1;
        for (int i = str2.length() - 1; i >= 0; i--) {
            int a = sb1.charAt(index) - 48;
            int b = sb2.charAt(i) - 48;
            int c = a + b + flag;
            flag=0;
            if (c < 10) {
                sb1.setCharAt(index, (char) (c + 48));
            } else {
                flag = c / 10;
                sb1.setCharAt(index, (char) (c % 10 + 48));
            }
            index--;
        }
        while (index >= 0) {
            int a = sb1.charAt(index) - 48;
            int c = a + flag;
            if (c < 10) {
                sb1.setCharAt(index, (char) (c + 48));
            } else {
                flag = c / 10;
                sb1.setCharAt(index, (char) (c % 10 + 48));
            }
            index--;
        }
        if (flag != 0) {
            sb1.insert(0, (char) (flag + 48));
        }


        BigInteger sum=new BigInteger(addend);
        BigInteger sum1=new BigInteger(augend);
        BigInteger res=sum.add(sum1);
        return res.toString();
//        return sb1.toString();
    }
}

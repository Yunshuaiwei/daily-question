package day06;

import java.util.*;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/5 17:42
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String str = input.nextLine();
        String s = "";
        //将读入的元素加入arr中，即取出读入的字符串中的空格
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                s += str.charAt(i);
            } else {
                arr.add(Integer.parseInt(s));
                s = "";
            }
        }
        int[] tmp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            tmp[i] = Integer.parseInt(String.valueOf(arr.get(i)));
        }
        Arrays.sort(tmp);
        int i = 0;
        //排除前tmp.length / 2的元素是需要查找的元素
        for (i = 0; i < tmp.length / 2; i++) {
            if (tmp[i] != tmp[0]) {
                break;
            }
        }
        //如果前tmp.length / 2是需要查找的元素则输出
        if (i == tmp.length / 2) {
            System.out.println(tmp[0]);
        } else {
            System.out.println(tmp[tmp.length / 2]);
        }
    }
}

package day17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/18 13:07
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int N = input.nextInt();
            int[] arr = new int[N];
            int[] tmp = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
                tmp[i] = arr[i];
            }
            ArrayList<String> list = dictionary(tmp);
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                boolean b = judgment(arr, s);
                if (b) {
                    print(s);
                    System.out.println();
                }
            }
        }
    }

    /**
     * 打印
     *
     * @return void
     * @Param [s]
     **/
    public static void print(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    /**
     * 判断字符串s是否满足火车出站顺序
     *
     * @return boolean
     * @Param [s]
     **/
    public static boolean judgment(int[] arr, String str) {
        int[] arr2 = new int[str.length()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = str.charAt(i) - 48;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            while (!stack.isEmpty() && stack.peek() == arr2[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
//        Stack<Integer> s = new Stack<>();
//        s.push(arr[0]);
//        int index = 1;
//        for (int i = 0; i < str.length(); i++) {
//            int n = str.charAt(i) - 48;
//            while (true) {
//                if (!s.isEmpty() && s.peek() == n) {
//                    s.pop();
//                    break;
//
//                } else {
//                    if (index == arr.length) {
//                        return false;
//                    }
//                    s.push(arr[index]);
//                    index++;
//                }
//            }
//        }
//        return true;
    }

    /**
     * 得到字典序
     *
     * @return void
     * @Param [arr]
     **/
    private static ArrayList<String> dictionary(int[] arr) {
        int i = 0;
        boolean flag = true;
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        while (true) {
            for (int j = 0; j < arr.length; j++) {
                s += arr[j];
            }
            list.add(s);
            s = "";
            //从右往左找出第一个左边小于右边的数，用i保存下标
            for (int k = arr.length - 1; k > 0; k--) {
                if (arr[k - 1] < arr[k]) {
                    i = k - 1;
                    flag = true;
                    break;
                }
                flag = false;
            }
            if (!flag) {
                break;
            }
            //从右往左找出第一个大于i位置的数，并且将两个数字进行交换
            for (int k = arr.length - 1; k >= 0; k--) {
                if (arr[k] > arr[i]) {
                    int tmp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = tmp;
                    break;
                }
            }
            //将i后面的数字由小到大排序
            sort(arr, i);
        }
        return list;
    }

    /**
     * 将i后面的数由小到大排序
     *
     * @return void
     * @Param [arr, i]
     **/
    public static void sort(int[] arr, int i) {
        int l = 1;
        for (int j = i + 1; j < arr.length - 1; j++) {
            for (int k = i + 1; k < arr.length - l; k++) {
                if (arr[k] > arr[k + 1]) {
                    int tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = tmp;
                }
            }
            l++;
        }
    }
}

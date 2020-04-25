package DS_Exam;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/24 18:33
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] s = line.split(" ");
            for (int i = 0; i < s.length; i++) {
                set.add(s[i]);
            }
        }
        System.out.println(set.size());
    }
}

package day19;

import java.util.*;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/21 15:37
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num = input.nextInt();
            int flag = input.nextInt();
            ArrayList<User> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(new User(input.next(), input.nextInt()));
            }
            if (flag == 0) {
                list.sort(new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o2.score - o1.score;
                    }
                });
            } else {
                list.sort(new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.score - o2.score;
                    }
                });
            }
            for (User user : list) {
                System.out.println(user.name + " " + user.score);
            }
        }
    }
}

class User {
    public String name;
    public int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
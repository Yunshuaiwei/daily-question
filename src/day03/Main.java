package day03;

import java.util.Stack;

/**
 * @author DELL
 * @Date 2020/4/2 16:21
 **/
public class Main {
    public static void main(String[] args) {
        String str = "()a()(a)";
        Main main = new Main();
        System.out.println(main.chkParenthesis(str, 6));
    }

    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (i == 0 && A.charAt(i) == ')') {
                return false;
            }
            if (A.charAt(i) == '(') {
                stack.push(A.charAt(i));
            }
            if (A.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && A.charAt(i) == ')') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

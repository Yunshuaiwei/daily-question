package day05;

import java.util.Stack;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/4 19:08
 * @Version
 **/
public class Main2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack1.empty()) {
            stack1.push(node);
        } else {
            while(!stack1.empty()){
                Integer pop = stack1.pop();
                stack2.push(pop);
            }
            stack1.push(node);
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
    }

    public int pop() {
        return stack1.pop();
    }
}

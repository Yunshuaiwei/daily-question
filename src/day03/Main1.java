package day03;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author DELL
 * @Date 2020/4/2 15:35
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.next();
        int index=0;
        int max=0;
        Stack<Character> stack = new Stack<>();
        String result="";
        stack.push(str.charAt(0));
        for (int i = 1; i <str.length(); i++) {
            char peek = stack.peek();
            if(peek+1==str.charAt(i)){
                stack.push(str.charAt(i));
                index++;
            }else{
                if(index>max){
                    result="";
                    while(!stack.isEmpty()){
                        result+=stack.pop();
                    }
                    max=index;
                }else{
                    stack.clear();
                }
                if(i+1<str.length()){
                    stack.push(str.charAt(i));
                }
                index=0;
            }
        }
        if(index>max){
            result="";
            while(!stack.isEmpty()){
                result+=stack.pop();
            }
        }
        for (int i = result.length()-1; i >=0 ; i--) {
            System.out.print(result.charAt(i));
        }
    }
}

package day16;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/16 16:15
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int N=input.nextInt();
            if(N==0){
                break;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int n=input.nextInt();
                if(map.containsKey(n)){
                    Integer val = map.get(n);
                    map.replace(n,val,++val);
                }else{
                    map.put(n,1);
                }
            }
            int target=input.nextInt();
            for (Integer key : map.keySet()) {
                if(target==key){
                    System.out.println(map.get(key));
                }
            }

        }
    }
}

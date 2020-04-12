package day12;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/12 14:56
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {

    }
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];
        return AB;
    }
}

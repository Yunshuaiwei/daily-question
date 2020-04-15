package day15;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/15 14:23
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {

    }

    public int addAB(int A, int B) {
        // write code here
        if (B == 0) {
            return A;
        }
        int sum = A ^ B;//表示没有进位
        int n = (A & B) << 1;// 有进位向左移
        return addAB(sum, n);//递归相加
    }
}

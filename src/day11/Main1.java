package day11;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/10 19:06
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {

    }
    public int[] multiply(int[] A) {
        int [] result=new int [A.length];
        for (int i = 0; i < A.length; i++) {
            result[i]=method(A,i);
        }
        return result;
    }
    public int method(int [] A,int i){
        int result=1;
        for (int j = 0; j < A.length; j++) {
            if(i!=j){
                result*=A[j];
            }
        }
        return result;
    }
}

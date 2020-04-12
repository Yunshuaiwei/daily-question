package day12;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/12 15:13
 * @Version
 **/
public class Main {
    public static void main(String[] args) {
        Main.getGray(3);
    }
    public static String[] getGray(int n) {
        // write code here
        String []arr=new String[(int)Math.pow(2,n)];
        if(n==1){
            arr[0]="0";
            arr[1]="1";
            return arr;
        }
        String [] str=getGray(n-1);
        for (int i = 0; i < str.length; i++) {
            arr[i]="0"+str[i];
            arr[arr.length-1-i]="1"+str[i];
        }
        return arr;
    }
}

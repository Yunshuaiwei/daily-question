package Day02;

/**
 * @author DELL
 * @Date 2020/4/1 15:07
 **/
public class Main2 {
    public static void main(String[] args) {
        int []A = new int[]{1, 2, 3, 4, 5, 6, 7, 0};
        Main2 main2 = new Main2();
        System.out.println(main2.count(A,8));
    }

    public int count(int[] A, int n) {
        // write code here
        int count = 0;
        int l = 0;
        int r = n - 1;
        while (true) {
            for (int i = n - 1; i >= l; i--) {
                if (A[i] < A[l]) {
                    count++;
                }
            }
            l++;
            if (l == r) {
                break;
            }
        }
        return count;
    }
}

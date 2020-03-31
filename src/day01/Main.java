package day01;

import java.util.PriorityQueue;

/**
 * @author DELL
 * @Date 2020/3/31 14:55
 **/
public class Main {
    public static void main(String[] args) {
        int [] a=new int[]{1,3,5,3,2};
        Main main = new Main();
        int kth = main.findKth(a, 5, 3);
        System.out.println(kth);

    }
    public int findKth(int[] a, int n, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(K);
        for (int i : a) {
            q.offer(i);

            if (q.size() > K) {
                q.poll();
            }
        }

        return q.peek();

//        return getK(K,a,0,a.length-1);
    }
    public static int getK(int k,int []a,int left,int right){
        int l=left;
        int r=right;
        int pivot=a[(l+r)/2];
        while(l<r){
            while(a[l]<pivot){
                l++;
            }
            while ((a[r])>pivot){
                r--;
            }
            if(l>=r){
                break;
            }
            int tmp=a[l];
            a[l]=a[r];
            a[r]=tmp;
            if (a[l] == pivot) {
                r -= 1;
            }
            if (a[r] == pivot) {
                l += 1;
            }
        }
        if(l==k-1){
            return pivot;
        }else if (k-1 < left) {
            return getK(k, a, 0, left );
        } else {
            return getK(k, a, left, a.length-1);
        }
    }
}

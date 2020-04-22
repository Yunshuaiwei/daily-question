package day20;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/22 18:28
 * @Version
 **/
public class Main1 {
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode cur=pHead;
        ListNode left=null;
        ListNode right=null;
        while(cur!=null){
            if(cur.val<x){
                ListNode node1 = new ListNode(cur.val);
                if(left==null){
                    left=node1;
                }else{
                    left.next=node1;
                }
            }else{
                ListNode node2 = new ListNode(cur.val);
                if(right==null){
                    right=node2;
                }else{
                    right.next=node2;
                }
            }
            cur=cur.next;
        }
        if(left!=null){

        }
        return null;
    }
}
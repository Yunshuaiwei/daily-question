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
        ListNode cur = pHead;
        ListNode left = null;
        ListNode l = null;
        ListNode right = null;
        ListNode r = null;
        while (cur != null) {
            if (cur.val < x) {
                ListNode node1 = new ListNode(cur.val);
                if (left == null) {
                    left = node1;
                    l = node1;
                } else {
                    l.next = node1;
                    l = l.next;
                }
            } else {
                ListNode node2 = new ListNode(cur.val);
                if (right == null) {
                    right = node2;
                    r = node2;
                } else {
                    r.next = node2;
                    r = r.next;
                }
            }
            cur = cur.next;
        }
        if (left != null) {
            l.next = right;
        } else {
            return right;
        }
        return left;
    }
}
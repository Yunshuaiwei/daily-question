package day22;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/24 15:20
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {
        Main1 m = new Main1();
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n = new ListNode(9);
        ListNode n8 = new ListNode(9);
        n4.next = n5;
        n5.next = n6;
        n6.next = n;
        n.next = n8;
        ListNode node = m.plusAB(n1, n4);
        ListNode cur = node;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode tmp1 = a;
        ListNode tmp2 = b;
        ListNode pre1 = null;
        ListNode pre2 = null;
        int flag = 0;
        while (tmp1 != null && tmp2 != null) {
            int n1 = tmp1.val;
            int n2 = tmp2.val;
            int sum = n1 + n2 + flag;
            if (sum < 10) {
                tmp1.val = sum;
            } else {
                flag = sum / 10;
                tmp1.val = sum % 10;
            }
            pre1 = tmp1;
            pre2 = tmp2;
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        if (tmp1 == null && tmp2 != null) {
            pre1.next = tmp2;
            pre1 = pre1.next;
            if (flag != 0) {
                while (pre1 != null) {
                    int n = pre1.val;
                    int sum = n + flag;
                    if (sum < 10) {
                        pre1.val = sum;
                    } else {
                        flag = sum / 10;
                        pre1.val = sum % 10;
                    }
                    tmp1 = pre1;
                    pre1 = pre1.next;
                }
                if (flag != 0) {
                    ListNode node = new ListNode(flag);
                    tmp1.next = node;
                }
            }
        } else if (tmp1 != null) {
            if (flag != 0) {
                while (tmp1 != null) {
                    int n = tmp1.val;
                    int sum = flag + n;
                    if (sum < 10) {
                        tmp1.val = sum;
                    } else {
                        flag = sum / 10;
                        tmp1.val = sum % 10;
                    }
                    pre1 = tmp1;
                    tmp1 = tmp1.next;
                }
                if (flag != 0) {
                    ListNode node = new ListNode(flag);
                    pre1.next = node;
                }
            }
        } else {
            if (flag != 0) {
                ListNode node = new ListNode(flag);
                pre1.next = node;
            }
        }
        return reverse(a);
    }

    public ListNode reverse(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode c = node.next;
        ListNode pre = node;
        ListNode curNext = null;
        pre.next = null;
        while (c != null) {
            curNext = c.next;
            c.next = pre;
            pre = c;
            c = curNext;
        }
        return pre;
    }
    /**
     * 单链表整数求和
     * @Param [a, b]
     * @return day22.ListNode
     **/
    public ListNode plusAB1(ListNode a, ListNode b) {
        // write code here
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        int flag = 0;
        int temp = 0;
        ListNode node = null;
        ListNode pnode = null;
        while (a != null && b != null) {
            temp = a.val + b.val + flag;
            flag = 0;
            if (temp >= 10) {
                temp %= 10;
                flag = 1;
            }
            ListNode root = new ListNode(temp);
            if (node == null) {
                node = root;
                pnode = root;
            } else {
                node.next = root;
                node = root;
            }
            a = a.next;
            b = b.next;
        }
        while (a != null) {
            temp = a.val + flag;
            flag = 0;
            if (temp >= 10) {
                temp %= 10;
                flag = 1;
            }
            ListNode root = new ListNode(temp);
            node.next = root;
            node = root;
            a = a.next;
        }
        while (b != null) {
            temp = b.val + flag;
            flag = 0;
            if (temp >= 10) {
                temp %= 10;
                flag = 1;
            }
            ListNode root = new ListNode(temp);
            node.next = root;
            node = root;
            b = b.next;
        }
        if (flag == 1) {
            ListNode root = new ListNode(1);
            node.next = root;
            node = root;
        }
        return pnode;
    }


}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



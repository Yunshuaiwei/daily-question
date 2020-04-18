package day17;

import sun.reflect.generics.tree.Tree;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/18 13:50
 * @Version
 **/
public class Main1 {

}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        Mirror(root.left);
        Mirror(root.right);
    }

}

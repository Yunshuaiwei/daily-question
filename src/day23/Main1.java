package day23;


/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/25 18:20
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {

    }

    /**
     * 判断树是否为平衡二叉树
     *
     * @return boolean
     * @Param [root]
     **/
    public boolean isBalance(TreeNode root) {
        // write code here
        int l = 0;
        int r = 0;
        if (root == null) {
            return false;
        }
        if (root.left != null) {
            l = height(root.left);
        }
        if (root.right != null) {
            r = height(root.right);
        }
        return Math.abs(l - r) <= 1;
    }

    /**
     * 求树的高度
     *
     * @return int
     * @Param [root]
     **/
    public int height(TreeNode root) {
        return Math.max(root.left == null ? 0 : height(root.left),
                root.right == null ? 0 : height(root.right)) + 1;
    }
}

/**
 * 节点类
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
package offer;

/**
 * @program: LeetCode *
 * @classname: T552 *
 * @author: lnback *
 * @create: 2020-08-03 10:33
 **/

public class T552 {
    public boolean isBalanced(TreeNode root) {
        if(root ==  null){
            return true;
        }
        //如果左子树和右子树的最高高度的差大于1则false
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right)) > 1) {
            return false;
        }
        //递归左子树和右子树
        return isBalanced(root.left) && isBalanced(root.right);

    }
    public int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(maxDepth(node.left ) + 1,maxDepth(node.right) + 1);
    }
}

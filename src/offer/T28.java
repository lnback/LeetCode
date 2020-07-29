package offer;

/**
 * @program: LeetCode *
 * @classname: T28 *
 * @author: lnback *
 * @create: 2020-07-29 12:56
 **/

public class T28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return solve(root.left,root.right);
    }

    private boolean solve(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        return left.val == right.val && solve(left.left,right.right) && solve(left.right,right.left);
    }
}

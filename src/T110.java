/**
 * @program: LeetCode *
 * @classname: T110 *
 * @author: lnback *
 * @create: 2019-11-19 22:08
 **/

public class T110 {
    public boolean isBalanced(TreeNode root) {
        return treeHeight(root) >= 0;
    }

    private int treeHeight(TreeNode root){
        if(root == null) {
            return 0;
        }
        int leftHeight = treeHeight(root.left),rightHeight = treeHeight(root.right);
        if(leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight-rightHeight) <= 1){
            return Math.max(leftHeight,rightHeight);
        }else {
            return -1;
        }
    }
}

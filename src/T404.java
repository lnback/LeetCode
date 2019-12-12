/**
 * @program: LeetCode *
 * @classname: T404 *
 * @author: lnback *
 * @create: 2019-12-09 16:08
 **/

public class T404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        /**
         * 判断左节点是否为叶子结点
         */
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + sum;
    }
}

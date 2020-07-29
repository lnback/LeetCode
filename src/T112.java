/**
 * @program: LeetCode *
 * @classname: T112 *
 * @author: lnback *
 * @create: 2019-11-20 13:34
 **/

public class T112 {
    /**
     * 到叶子结点时判断sum是否为0
     *
     * @param root
     * @param sum
     * @return
     */
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}

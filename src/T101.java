/**
 * @program: LeetCode *
 * @classname: T101 *
 * @author: lnback *
 * @create: 2019-11-19 20:05
 **/

/**
 * 递归思路：
 * 1.根为空时返回true
 * 2.根不为空时判断左子树与右子树是否相等
 * 3.再判断 左子树的左子树 和 右子树的右子树 以及 左子树的右子树 和 右子树的左子树 是否相等
 * 形成递归思路
 */
public class T101 {
    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isTrue(root.left,root.right);
    }
    public static boolean isTrue(TreeNode left,TreeNode right){
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        } else {
            return isTrue(left.left,right.right)&&isTrue(left.right,right.left);
        }
    }
}

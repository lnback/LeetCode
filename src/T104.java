/**
 * @program: LeetCode *
 * @classname: T104 *
 * @author: lnback *
 * @create: 2019-11-18 21:07
 **/

public class T104 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right) + 1);
    }
}

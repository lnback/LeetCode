/**
 * @program: LeetCode *
 * @classname: T111 *
 * @author: lnback *
 * @create: 2019-11-20 12:53
 **/

public class T111 {
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.right == null){
            return minDepth(root.left) + 1;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }

}

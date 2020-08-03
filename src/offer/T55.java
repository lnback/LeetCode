package offer;

/**
 * @program: LeetCode *
 * @classname: T55 *
 * @author: lnback *
 * @create: 2020-08-03 10:24
 **/

public class T55 {
    public int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right) +1;
        return left > right ? left : right;
    }
}

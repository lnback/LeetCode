package offer;

/**
 * @program: LeetCode *
 * @classname: T26 *
 * @author: lnback *
 * @create: 2020-07-29 12:28
 **/

public class T26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        return solve(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean solve(TreeNode a, TreeNode b) {
        if(b == null){
            return true;
        }
        if(a == null){
            return false;
        }

        return a.val == b.val && solve(a.left,b.left) && solve(a.right,b.right);
    }
}

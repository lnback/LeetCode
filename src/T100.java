/**
 * @program: LeetCode *
 * @classname: T100 *
 * @author: lnback *
 * @create: 2019-11-18 21:00
 **/

public class T100 {
    /**
     *
     * @param p
     * @param q
     * @return
     * 递归：
     * 1.两棵树是否为空
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }
}

/**
 * @program: LeetCode *
 * @classname: T235 *
 * @author: lnback *
 * @create: 2019-12-04 16:24
 **/

public class T235 {
    /**
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val == root.val){
            return p;
        }
        if(q.val == root.val){
            return q;
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return root;
        }
    }
}

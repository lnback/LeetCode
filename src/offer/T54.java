package offer;

/**
 * @program: LeetCode *
 * @classname: T54 *
 * @author: lnback *
 * @create: 2020-08-03 10:03
 **/

public class T54 {
    private int ans,cnt = 0;
    public int kthLargest(TreeNode root, int k) {
        Inorder(root,k);
        return ans;
    }

    public void Inorder(TreeNode node,int k){
        if(node == null){
            return;
        }
        if(node.right != null){
            Inorder(node.right,k);
        }
        if(++cnt == k){
            ans = node.val;
        }
        if(node.left != null){
            Inorder(node.left,k);
        }
    }
}

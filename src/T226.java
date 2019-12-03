/**
 * @program: LeetCode *
 * @classname: T226 *
 * @author: lnback *
 * @create: 2019-11-29 16:21
 **/

public class T226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }else {
            TreeNode leftNode = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(leftNode);
        }
        return root;
    }


}

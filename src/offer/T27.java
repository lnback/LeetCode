package offer;

import javafx.scene.transform.Rotate;

/**
 * @program: LeetCode *
 * @classname: T27 *
 * @author: lnback *
 * @create: 2020-07-29 12:39
 **/

public class T27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);

        return root;
    }
}

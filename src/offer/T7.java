package offer;

import java.util.Arrays;

/**
 * @program: LeetCode *
 * @classname: T7 *
 * @author: lnback *
 * @create: 2020-07-15 09:20
 **/

public class T7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int rootIndex = 0;
        for (int i = 0; i < inorder.length;i++){
            if(preorder[0] == inorder[i]){
                rootIndex = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder,1,rootIndex + 1),Arrays.copyOfRange(inorder,0,rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder,rootIndex+1,preorder.length),Arrays.copyOfRange(inorder,rootIndex+1,inorder.length));
        return root;

    }
}

package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T32 *
 * @author: lnback *
 * @create: 2020-07-29 14:13
 **/
//二叉树的中序遍历：使用队列实现

public class T32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size != 0){
                TreeNode node = queue.removeFirst();
                list.add(node.val);
                if(node.left != null){
                    queue.addLast(node.left);
                }
                if(node.right != null){
                    queue.addLast(node.right);
                }
                size--;
            }

        }

        int[] nums = new int[list.size()];
        for(int i = 0; i < nums.length;i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}

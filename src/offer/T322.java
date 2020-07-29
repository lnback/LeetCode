package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T322 *
 * @author: lnback *
 * @create: 2020-07-29 14:32
 **/

public class T322 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
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
            ans.add(new ArrayList<>(list));
            list.clear();
        }
        return ans;

    }
}

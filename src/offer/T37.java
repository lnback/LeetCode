package offer;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: LeetCode *
 * @classname: T37 *
 * @author: lnback *
 * @create: 2020-07-31 12:57
 **/

public class T37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "null,";
        }
        String res = root.val + ",";
        res += serialize(root.left);
        res += serialize(root.right);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[] = data.split(",");
        Deque<String> queue = new LinkedList<>();
        for(int i = 0; i < arr.length ;i++){
            queue.offer(arr[i]);
        }
        return solve(queue);
    }

    private TreeNode solve(Deque<String> queue) {
        String val = queue.poll();
        if(val.equals("null")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(val));
        node.left = solve(queue);
        node.right = solve(queue);
        return node;
    }
}

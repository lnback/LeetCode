package offer;

import java.util.*;

/**
 * @program: LeetCode *
 * @classname: T303 *
 * @author: lnback *
 * @create: 2020-07-30 15:00
 **/

public class T323 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int count=0;
        Deque<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
            count++;
            if(count%2==0){
                Collections.reverse(list);
            }
            ans.add(list);
        }
        return ans;
    }
}

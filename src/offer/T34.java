package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T34 *
 * @author: lnback *
 * @create: 2020-07-30 15:37
 **/

public class T34 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,root,sum,new ArrayList<>());
        return ans;
    }

    private void solve(List<List<Integer>> ans, TreeNode root, int sum,List<Integer> list) {
        if(root == null){
            return;
        }
        list.add(root.val);
        sum -= root.val;
        if(sum == 0 && root.left == null && root.right == null){
            ans.add(new ArrayList<>(list));
        }else {
            solve(ans,root.left,sum,list);
            solve(ans,root.right,sum,list);
        }
        list.remove(list.size() - 1);
    }
}

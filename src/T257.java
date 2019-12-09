import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T257 *
 * @author: lnback *
 * @create: 2019-12-04 16:50
 **/

public class T257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        solve(root,"",ans);
        return ans;
    }
    private static void solve(TreeNode root,String cur,List<String> ans){
        if(root == null){
            return;
        }
        cur += root.val;
        /**
         * 判断是否为叶子结点
         */
        if(root.left == null && root.right == null){
            ans.add(cur);
        }else {
            solve(root.left,cur+"->",ans);
            solve(root.right,cur+"->",ans);
        }
    }
}

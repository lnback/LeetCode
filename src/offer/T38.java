package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T38 *
 * @author: lnback *
 * @create: 2020-07-31 13:06
 **/

public class T38 {
    public String[] permutation(String s) {
        int len = s.length();
        if(len == 0){
            return new String[0];
        }

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[len];

        List<String> res = new ArrayList<>();
        dfs(chars,len,0,used,path,res);
        return res.toArray(new String[0]);
    }

    private void dfs(char[] chars, int len, int depth, boolean[] used, StringBuilder path, List<String> res) {
        if (depth == len) {
            // path.toString() 恰好生成了新的字符对象
            res.add(path.toString());
            return;
        }

        for(int i = 0;i<len;i++){
            if(!used[i]){
                if(i > 0 && chars[i] == chars[i - 1] && !used[i-1]){
                    continue;
                }
                used[i] = true;
                path.append(chars[i]);

                dfs(chars,len,depth + 1,used,path,res);

                path.deleteCharAt(path.length() - 1);
                used[i] = false;
            }
        }
    }
}

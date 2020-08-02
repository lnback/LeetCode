package offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode *
 * @classname: T48 *
 * @author: lnback *
 * @create: 2020-08-02 15:23
 **/

public class T48 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int l = 0,r = 0;r < s.length();r++){
            char c = s.charAt(r);
            while (set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}

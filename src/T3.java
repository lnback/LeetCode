import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T3 *
 * @author: lnback *
 * @create: 2019-10-09 21:38
 **/

public class T3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<String,Integer> map = new HashMap<>();
        int ans = 0;
        int len = 0;
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.substring(i,i+1))){
                len = 1;
                map.clear();
                map.put(s.substring(i,i+1),i);
            }else {
                map.put(s.substring(i,i+1),i);
                len ++;
            }
            ans = Math.max(ans,len);
        }
        return ans;
    }
}

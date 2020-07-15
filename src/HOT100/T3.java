package HOT100;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode *
 * @classname: T3 *
 * @author: lnback *
 * @create: 2020-03-03 16:50
 **/

public class T3 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums){
            if(set.contains(num)){
                ans = num;
                break;
            }else{
                set.add(num);
            }
        }
        return ans;
    }
}

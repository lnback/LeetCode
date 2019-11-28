import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode *
 * @classname: T217 *
 * @author: lnback *
 * @create: 2019-11-28 20:24
 **/

public class T217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}

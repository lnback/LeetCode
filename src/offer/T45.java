package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T45 *
 * @author: lnback *
 * @create: 2020-08-02 11:43
 **/

public class T45 {
    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int num : nums){
            list.add(String.valueOf(num));
        }
        list.sort((o1,o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("",list);
    }
}

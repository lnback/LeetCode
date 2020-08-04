package offer;

/**
 * @program: LeetCode *
 * @classname: T61 *
 * @author: lnback *
 * @create: 2020-08-04 15:16
 **/

public class T61 {
    public boolean isStraight(int[] nums) {
        int[] cards = new int[14];
        int max = 0, min = 14;
        for(int num : nums){
            if(num == 0) {
                continue;
            }
            if(cards[num] ++ > 0) {
                return false;
            }
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        return max - min < 5;
    }
}

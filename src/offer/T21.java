package offer;

/**
 * @program: LeetCode *
 * @classname: T21 *
 * @author: lnback *
 * @create: 2020-07-27 13:37
 **/

public class T21 {
    public int[] exchange(int[] nums) {
        int left = 0,right = nums.length - 1;
        while (left < right){
            while (left < right && nums[left] % 2 == 1){
                left++;
            }
            while (left < right && nums[right] % 2 == 0){
                right--;
            }
            if(left < right){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        return nums;
    }
}

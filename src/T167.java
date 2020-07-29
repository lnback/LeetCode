/**
 * @program: LeetCode *
 * @classname: T167 *
 * @author: lnback *
 * @create: 2019-11-21 14:41
 **/

public class T167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                ans[0] = right + 1;
                ans[1] = left + 1;
            }
        }
        return ans;
    }
}

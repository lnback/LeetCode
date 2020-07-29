/**
 * @program: LeetCode *
 * @classname: T136 *
 * @author: lnback *
 * @create: 2019-11-20 21:52
 **/

public class T136 {
    /**
     * 异或：
     * 性质：
     * 0与任何数异或为任何数 0 ^ n = n
     * 相同两个数异或为0 n ^ n = 0
     * 不同两个数的异或计算化为二进制计算
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}

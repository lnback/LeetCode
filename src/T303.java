/**
 * @program: LeetCode *
 * @classname: T303 *
 * @author: lnback *
 * @create: 2019-12-08 12:57
 **/

public class T303 {
    class NumArray {
        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = new int[nums.length];
            if (nums.length == 0) {
                return;
            }
            this.nums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                this.nums[i] += this.nums[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return this.nums[j];
            } else {
                return this.nums[j] - this.nums[i - 1];
            }
        }
    }
}

/**
 * @program: LeetCode *
 * @classname: T371 *
 * @author: lnback *
 * @create: 2019-12-09 14:33
 **/

public class T371 {
    public int getSum(int a, int b) {
        /**
         * a ^ b 相当于相加不进位
         * (a & b) << 1为进位
         * 直到进位为0时即为最后的结果
         */
        return b == 0 ? a : getSum(a^b,(a&b)<<1);
    }
}

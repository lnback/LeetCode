/**
 * @program: LeetCode *
 * @classname: T326 *
 * @author: lnback *
 * @create: 2019-12-08 16:51
 **/

public class T326 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}

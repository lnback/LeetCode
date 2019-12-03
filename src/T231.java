/**
 * @program: LeetCode *
 * @classname: T231 *
 * @author: lnback *
 * @create: 2019-11-29 16:40
 **/

public class T231 {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n-1)) == 0;
    }
}

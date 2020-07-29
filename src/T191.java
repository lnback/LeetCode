/**
 * @program: LeetCode *
 * @classname: T191 *
 * @author: lnback *
 * @create: 2019-11-24 20:24
 **/

public class T191 {
    /**
     * n&(n-1)的用处：
     * 1.判断n是否为2的幂方
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= n - 1;
        }
        return cnt;
    }
}

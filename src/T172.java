/**
 * @program: LeetCode *
 * @classname: T172 *
 * @author: lnback *
 * @create: 2019-11-22 10:49
 **/

public class T172 {
    /**
     * 统计5的个数就相当于0的个数
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n / 5 != 0){
            ans += n/5;
            n/=5;
        }
        return ans;
    }
}

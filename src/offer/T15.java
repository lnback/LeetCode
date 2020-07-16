package offer;

/**
 * @program: LeetCode *
 * @classname: T15 *
 * @author: lnback *
 * @create: 2020-07-16 10:15
 **/

public class T15 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0){
            ans ++;
            n = n & (n - 1);
        }
        return ans;
    }
}

package offer;

/**
 * @program: LeetCode *
 * @classname: T62 *
 * @author: lnback *
 * @create: 2020-08-04 15:22
 **/
//约瑟夫环
public class T62 {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}

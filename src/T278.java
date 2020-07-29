/**
 * @program: LeetCode *
 * @classname: T278 *
 * @author: lnback *
 * @create: 2019-12-05 17:14
 **/


public class T278 {
    /**
     * 二分法：
     * 需注意一个地方：
     * mid = (low + high)/2 会溢出 (low + high)/2 = low + (high - low)/2
     * mid = low + (high - low) / 2;
     *
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}

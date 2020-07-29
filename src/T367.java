/**
 * @program: LeetCode *
 * @classname: T367 *
 * @author: lnback *
 * @create: 2019-12-09 14:07
 **/

public class T367 {
    /**
     * 两种做法：
     * 1.利用1 + 3 + ... + (2n - 1) = n * n
     * 2.二分
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {

//        int t = 1;
//        while (num > 0){
//            num -= t;
//            t += 2;
//        }
//        return num == 0;
//
        long l = 0, r = num;
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (mid * mid < num) {
                l = mid + 1;
            } else if (mid * mid > num) {
                r = mid;
            } else {
                return true;
            }
        }
        return false;

    }
}

package offer;

/**
 * @program: LeetCode *
 * @classname: T43 *
 * @author: lnback *
 * @create: 2020-08-01 11:20
 **/

public class T43 {
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long cnt = 9;
        while (n > cnt){
            n -= cnt;
            digit ++;
            start *= 10;
            cnt = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n-1)%digit) - '0';
    }
}

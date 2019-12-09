import com.sun.org.apache.regexp.internal.RE;

/**
 * @program: LeetCode *
 * @classname: T374 *
 * @author: lnback *
 * @create: 2019-12-09 14:47
 **/

public class T374 {
    public int guessNumber(int n) {
        long l = 0,r = n;
        while (l < r){
            long mid = l + (r - l) /2;
            if(guess((int)mid) == -1){
                r = mid - 1;
            }else if(guess((int)mid) == 1){
                l = mid + 1;
            }else {
                return (int)mid;
            }
        }
        return (int)l;
    }
    private static int guess(int n){
        return n;
    }

}

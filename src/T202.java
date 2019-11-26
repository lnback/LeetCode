import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode *
 * @classname: T202 *
 * @author: lnback *
 * @create: 2019-11-26 20:12
 **/

public class T202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            while(n != 0){
                sum += Math.pow(n % 10,2);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}

/**
 * @program: LeetCode *
 * @classname: T3421 *
 * @author: lnback *
 * @create: 2019-12-08 16:59
 **/

public class T342 {
    /**
     * 是4的幂也肯定是2的幂，首先排除不是2的幂的数
     * 再通过num % 3排除是2的幂不是4的幂的数
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        if(num < 0 || (num & (num-1)) != 0){
            return false;
        }
        return num % 3 == 1;
    }
}

package offer;

/**
 * @program: LeetCode *
 * @classname: T141 *
 * @author: lnback *
 * @create: 2020-07-16 10:29
 **/

public class T14 {
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        //将n分为由最多3组成的数列 到最后结果只会变成2,1,0。1时不做处理，因为1*3<2*2。所以只有n>4才循环。
        long sum = 1;
        while (n > 4) {
            sum *= 3;
            sum %= 1000000007;
            n -= 3;
        }
        return (int) sum * n % 1000000007;
    }
}

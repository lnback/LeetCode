package offer;

/**
 * @program: LeetCode *
 * @classname: T10 *
 * @author: lnback *
 * @create: 2020-07-15 11:01
 **/

public class T101 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1, b = 0;
        for (int i = 1; i < n; i++) {
            a = a + b;
            b = a - b;
            a %= 1000000007;
        }
        return a;
    }
}

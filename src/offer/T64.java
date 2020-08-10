package offer;

/**
 * @program: LeetCode *
 * @classname: T64 *
 * @author: lnback *
 * @create: 2020-08-10 11:55
 **/

public class T64 {
    public int sumNums(int n) {
        int sum = n;
        boolean flag = n > 0 && (sum += sumNums(n-1)) > 0;
        return sum;
    }
}

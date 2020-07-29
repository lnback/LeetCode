/**
 * @program: LeetCode *
 * @classname: T258 *
 * @author: lnback *
 * @create: 2019-12-04 17:11
 **/

public class T258 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}

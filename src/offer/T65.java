package offer;

/**
 * @program: LeetCode *
 * @classname: T65 *
 * @author: lnback *
 * @create: 2020-08-10 12:50
 **/

public class T65 {
    public int add(int a, int b) {
        if(b == 0){
            return a;
        }
        int c = (a&b) << 1;
        int d = a ^ b;
        return add(d,c);
    }
}

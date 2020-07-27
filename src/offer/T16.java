package offer;

/**
 * @program: LeetCode *
 * @classname: T106 *
 * @author: lnback *
 * @create: 2020-07-27 09:36
 **/

public class T16 {
    public static double myPow(double x, int n) {
        double res = 1.0;
        long exp = n > 0 ? n : -n;
        while (exp > 0){
            if(exp % 2 == 1){
                res *= x;
            }
            exp /= 2;
            x *= x;
        }
        return n > 0 ? res : (1.0/res);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2147483648));
    }
}

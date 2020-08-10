package offer;

/**
 * @program: LeetCode *
 * @classname: T66 *
 * @author: lnback *
 * @create: 2020-08-10 13:06
 **/

public class T66 {
    public static int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0, cur = 1; i < a.length; i++) {
            res[i] = cur;   // 先乘左边的数(不包括自己)
            cur *= a[i];
            System.out.println(cur +"   " + res[i]);
        }
        for (int i = a.length - 1, cur = 1; i >= 0; i--) {
            res[i] *= cur;  // 再乘右边的数(不包括自己)
            cur *= a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        constructArr(new int[]{1,2,3,4,5});
    }
}

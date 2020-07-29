/**
 * @program: LeetCode *
 * @classname: T88 *
 * @author: lnback *
 * @create: 2019-11-18 20:06
 **/

public class T88 {
    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n     思路：因为nums1数组中有多余的位置，可以从大到小依次比较，将两个数组中的数字放到nums1中响应的位置
     *              当m未完时，说明此时的nums1中的数都比nums2小，并且此时nums1中的数是有序的，不需要做其他操作
     *              当n未完时，说明此时的nums2中的数都比nums1小，此时的n表示为在nums2中还剩n个数没有排位置，该n个数应该排在nums1中的前n个
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m > 0 || n > 0) {
            int valueM;
            int valueN;
            if (m > 0 && n > 0) {
                valueM = nums1[m - 1];
                valueN = nums2[n - 1];
                if (valueM > valueN) {
                    nums1[m + n - 1] = valueM;
                    m--;
                } else {
                    nums1[m + n - 1] = valueN;
                    n--;
                }
            } else if (m > 0) {
                break;
            } else {
                nums1[n - 1] = nums2[n - 1];
                n--;
            }
        }
    }
}

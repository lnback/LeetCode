package offer;

/**
 * @program: LeetCode *
 * @classname: T582 *
 * @author: lnback *
 * @create: 2020-08-04 10:44
 **/

public class T582 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}

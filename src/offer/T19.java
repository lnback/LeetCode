package offer;

/**
 * @program: LeetCode *
 * @classname: T19 *
 * @author: lnback *
 * @create: 2020-07-27 13:01
 **/

public class T19 {
    public boolean isMatch(String s, String p) {
        if (s == null && p == null) {
            return true;
        }
        if (s == null || p == null) {
            return false;
        }
        if (s.equals(p)) {
            return true;
        }
        return solve(s.toCharArray(), 0, p.toCharArray(), 0);
    }

    private boolean solve(char[] s, int sIndex, char[] p, int pIndex) {
        if (sIndex >= s.length && pIndex >= p.length) {
            return true;
        }
        /*
        pattern不够长了，还未匹配完。
         */
        if (sIndex < s.length && pIndex >= p.length) {
            return false;
        }
        if (pIndex + 1 < p.length && p[pIndex + 1] == '*') {
            if (sIndex < s.length && (s[sIndex] == p[pIndex] || p[pIndex] == '.')) {
                return solve(s, sIndex + 1, p, pIndex) || solve(s, sIndex, p, pIndex + 2);

            } else {
                return solve(s, sIndex, p, pIndex + 2);
            }
        }
        if (sIndex < s.length && (s[sIndex] == p[pIndex] || p[pIndex] == '.')) {
            return solve(s, sIndex + 1, p, pIndex + 1);
        } else {
            return false;
        }

    }
}

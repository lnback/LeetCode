/**
 * @program: LeetCode *
 * @classname: T409 *
 * @author: lnback *
 * @create: 2019-12-12 13:16
 **/

public class T409 {
    public int longestPalindrome(String s) {
        //26个小写+26个大写+中间6个字符
        int[] cnts = new int[58];
        for (char c : s.toCharArray()) {
            cnts[c - 'A'] += 1;
        }
        int ans = 0;
        int flag = 0;
        for (int cnt : cnts) {
            if (cnt % 2 == 0) {
                ans += cnt;
            } else {
                ans += cnt - 1;
                flag = 1;
            }
        }
        return ans + flag;
    }
}

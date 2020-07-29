/**
 * @program: LeetCode *
 * @classname: T125 *
 * @author: lnback *
 * @create: 2019-11-20 21:33
 **/

public class T125 {
    /**
     * 思路：使用正则表达式将字符串变为只有数字和小写字母的串
     * replaceAll():
     * regex：正则表达式 replacement：要替换的内容（如果为空则不替换）
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

/**
 * @program: LeetCode *
 * @classname: T28 *
 * @author: lnback *
 * @create: 2019-11-18 10:47
 **/

public class T28 {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int len = needle.length();
        for (int i = 0;i+len<=haystack.length();i++){
            String s = haystack.substring(i,i+len);
            if(s.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

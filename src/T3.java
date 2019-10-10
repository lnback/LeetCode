import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T3 *
 * @author: lnback *
 * @create: 2019-10-09 21:38
 **/

public class T3 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        //作为子串的起点
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++) {
            /**
             * 维护一个假子串
             * 只记录下标
             */
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }
}

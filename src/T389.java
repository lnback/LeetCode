import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode *
 * @classname: T389 *
 * @author: lnback *
 * @create: 2019-12-09 15:47
 **/

public class T389 {
    public char findTheDifference(String s, String t) {
        int num = 0;
        for(int i = 0;i<s.length();i++){
            num ^= (int)s.charAt(i);
        }
        for(int i = 0;i<t.length();i++){
            num ^= (int)t.charAt(i);
        }
        return (char)num;
    }
}

package offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode *
 * @classname: T50 *
 * @author: lnback *
 * @create: 2020-08-02 15:36
 **/

public class T50 {
    public char firstUniqChar(String s) {
        if(s.equals("") || s == null){
            return ' ';
        }
        int[] target = new int[26];

        for(int i = 0; i < s.length() ; i++){
            target[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0; i < s.length();i++){
            if(target[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}

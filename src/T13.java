/**
 * @program: LeetCode *
 * @classname: T13 *
 * @author: lnback *
 * @create: 2019-11-17 19:57
 **/

import java.util.HashMap;
import java.util.Map;

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * IV 4 IX 9
 * XL 40 XC 90
 * CD 400 CM 900
 */
public class T13 {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);map.put('D',500);map.put('M',1000);
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            char curChar = s.charAt(i);
            int curValue = map.get(curChar);
            int nextValue = s.length() - 1 > i ? map.get(s.charAt(i+1)) : 0;
            sum += curValue < nextValue ? -curValue : curValue;
        }
        return sum;
    }
}

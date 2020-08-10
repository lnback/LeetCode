package offer;

import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.ReturnNode;

import java.util.Arrays;

/**
 * @program: LeetCode *
 * @classname: T68 *
 * @author: lnback *
 * @create: 2020-08-10 13:24
 **/

public class T67 {

    public int strToInt(String str) {
        int i = 0;
        long res = 0;
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        boolean isMinus = false;
        char[] chars = str.toCharArray();
        if (chars[0] == '+' || chars[0] == '-' || Character.isDigit(chars[0])) {
            if(chars[0] == '+' || chars[0] == '-'){
                //是不是负号啊
                if(chars[0] == '-'){
                    isMinus = true;
                }
                //删除首位
                chars = Arrays.copyOfRange(chars,1,chars.length);
            }
            while (i < chars.length && Character.isDigit(chars[i])){
                res *= 10;
                res += chars[i] - '0';
                if(res > Integer.MAX_VALUE){
                    return !isMinus ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                i ++;
            }
            return isMinus ? -(int)res : (int)res;
        }
        return 0;
    }

}

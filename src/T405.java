/**
 * @program: LeetCode *
 * @classname: T405 *
 * @author: lnback *
 * @create: 2019-12-11 13:35
 **/

public class T405 {
    public String toHex(int num) {
        char[] hex = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0 && sb.length() < 8) {
            sb.append(hex[num & 0xf]);
            num >>= 4;
        }
        return sb.reverse().toString();
    }
}

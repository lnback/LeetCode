package offer;

/**
 * @program: LeetCode *
 * @classname: T58 *
 * @author: lnback *
 * @create: 2020-08-04 10:34
 **/

public class T58 {
    public static String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length - 1;i >= 0;i--){
            sb.append(strs[i]);
            sb.append("1");
        }
        String ans = sb.toString().trim();

        return ans;
    }
}

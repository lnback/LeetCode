import javax.xml.transform.Source;

/**
 * @program: LeetCode *
 * @classname: T14 *
 * @author: lnback *
 * @create: 2019-11-20 17:04
 **/

public class T14 {
    public String longestCommonPrefix(String[] strs) {
        long startTime = System.currentTimeMillis();
        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //当字符串中不包含该前缀时，不断缩减str
            while (strs[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return str;
    }
}

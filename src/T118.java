import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T118 *
 * @author: lnback *
 * @create: 2019-11-20 16:10
 **/

public class T118 {
    /**
     * arrayList可以用来做一维数组，通过get(index)访问即可
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    list.add(1);
                } else {
                    list.add(ans.get(i - 2).get(j - 2) + ans.get(i - 2).get(j - 1));
                }
            }
            ans.add(list);
        }
        return ans;
    }
}

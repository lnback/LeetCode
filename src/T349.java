import com.sun.xml.internal.ws.server.sei.SEIInvokerTube;

import java.util.*;

/**
 * @program: LeetCode *
 * @classname: T349 *
 * @author: lnback *
 * @create: 2019-12-09 12:59
 **/

public class T349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        int index = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                nums2[index++] = nums2[j];
                set.remove(nums2[j]);
            }
        }
        return Arrays.copyOfRange(nums2, 0, index);
    }
}

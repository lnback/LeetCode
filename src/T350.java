import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T350 *
 * @author: lnback *
 * @create: 2019-12-09 13:53
 **/

public class T350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for(int i = 0,j = 0; i < nums1.length && j < nums2.length;){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0 ;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}

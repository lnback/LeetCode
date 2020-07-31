package offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: LeetCode *
 * @classname: T34 *
 * @author: lnback *
 * @create: 2020-07-30 15:17
 **/

public class T33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length <= 1){
            return true;
        }
        int root = postorder[postorder.length  - 1 ];
        int i = 0;
        while (postorder[i] < root){
            i++;
        }
        boolean left = verifyPostorder(Arrays.copyOfRange(postorder,0,i));
        int rightIndex = i;
        while (i < postorder.length - 1){
            if(postorder[i] < root){
                return false;
            }
            i++;
        }

        return left && verifyPostorder(Arrays.copyOfRange(postorder,rightIndex,i));
    }
}

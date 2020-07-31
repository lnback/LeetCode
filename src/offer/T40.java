package offer;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: LeetCode *
 * @classname: T40 *
 * @author: lnback *
 * @create: 2020-07-31 13:27
 **/

public class T40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr == null || k <= 0) {
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>();
        int[] res = new int[k];
        for(int i = 0;i<arr.length;i++){
            queue.offer(arr[i]);
        }
        for(int i = 0;i<k;i++){
            res[i] = queue.poll();
        }
        return res;
    }
}

package offer;

import java.util.*;

/**
 * @program: LeetCode *
 * @classname: T59 *
 * @author: lnback *
 * @create: 2020-08-04 10:50
 **/

public class T59 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        LinkedList<Integer> queue = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];
        for(int i = 0,j = 0;i < nums.length;i++){
            //先判断窗口大小是否超过k 超过就把队首弹出
            if(!queue.isEmpty() && i - queue.peek() + 1 > k){
                queue.poll();
            }
            //根据单调队列的特性，从大到小排序
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]){
                queue.pollLast();
            }
            //入队
            queue.offer(i);
            //判断是否符合窗口的大小
            if(i - k + 1 >= 0){
                ans[j++] = nums[queue.peek()];
            }
        }
        return ans;

    }
}

package offer;

/**
 * @program: LeetCode *
 * @classname: T6 *
 * @author: lnback *
 * @create: 2020-07-15 09:11
 **/

public class T6 {
    public int[] reversePrint(ListNode head) {
        int cnt = 0;
        ListNode node = head;
        while (node != null){
            cnt++;
            node = node.next;
        }
        int[] nums = new int[cnt];
        node = head;
        for(int i = cnt - 1;i >=0 ;i--){
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }

}

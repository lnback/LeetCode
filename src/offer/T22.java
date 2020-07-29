package offer;

/**
 * @program: LeetCode *
 * @classname: T22 *
 * @author: lnback *
 * @create: 2020-07-27 13:59
 **/

public class T22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;

        while (fast != null) {
            fast = fast.next;
            if (k == 0) {
                head = head.next;
            }
            {
                k--;
            }
        }
        return head;
    }
}

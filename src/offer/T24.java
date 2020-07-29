package offer;

/**
 * @program: LeetCode *
 * @classname: T24 *
 * @author: lnback *
 * @create: 2020-07-29 12:11
 **/

public class T24 {
    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

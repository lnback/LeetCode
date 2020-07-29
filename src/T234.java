/**
 * @program: LeetCode *
 * @classname: T234 *
 * @author: lnback *
 * @create: 2019-12-04 15:57
 **/

public class T234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        /**
         * 找中间结点
         */
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : fast.next;
        }
        /**
         * 反转链表
         */
        ListNode pre = null;
        ListNode cur = slow;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        /**
         * 比较
         */
        while (pre != null && head != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}

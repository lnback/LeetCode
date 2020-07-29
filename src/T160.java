/**
 * @program: LeetCode *
 * @classname: T160 *
 * @author: lnback *
 * @create: 2019-11-21 14:27
 **/

public class T160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headB : b.next;
        }
        return a;
    }
}

/**
 * @program: LeetCode *
 * @classname: T141 *
 * @author: lnback *
 * @create: 2019-11-20 22:04
 **/

public class T141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}

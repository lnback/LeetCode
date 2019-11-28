/**
 * @program: LeetCode *
 * @classname: T206 *
 * @author: lnback *
 * @create: 2019-11-28 19:51
 **/

public class T206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            //记录下一个结点
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

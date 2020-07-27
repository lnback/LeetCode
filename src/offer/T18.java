package offer;

/**
 * @program: LeetCode *
 * @classname: T18 *
 * @author: lnback *
 * @create: 2020-07-27 12:39
 **/

public class T18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode pre = h;
        ListNode cur = head;

        while (cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                break;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        return h.next;
    }

}

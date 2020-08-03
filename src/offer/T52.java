package offer;

/**
 * @program: LeetCode *
 * @classname: T52 *
 * @author: lnback *
 * @create: 2020-08-03 09:20
 **/

public class T52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode l1 = headA,l2 = headB;
        while (l1 != l2 ){
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }
}

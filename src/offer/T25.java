package offer;

import java.util.function.Predicate;

/**
 * @program: LeetCode *
 * @classname: T25 *
 * @author: lnback *
 * @create: 2020-07-29 12:22
 **/

public class T25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0),cur = newList;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            cur.next = l1;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return newList.next;
    }
}

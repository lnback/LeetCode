/**
 * @program: LeetCode *
 * @classname: T237 *
 * @author: lnback *
 * @create: 2019-12-04 16:31
 **/

public class T237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next  = node.next.next;
    }
}

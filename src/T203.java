/**
 * @program: LeetCode *
 * @classname: T203 *
 * @author: lnback *
 * @create: 2019-11-26 20:32
 **/

public class T203 {
    /**
     * 因为第一个结点的值也可能为val,要把head作为第二个结点
     * 最后返回header.next即可
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode node = header;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return header.next;
    }
}

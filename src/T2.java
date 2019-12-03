/**
 * @program: LeetCode *
 * @classname: T2 *
 * @author: lnback *
 * @create: 2019-10-09 21:03
 **/

public class T2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        int other = 0;
        ListNode newNode = root;
        /**
         * 判断条件
         * 1.l1 或 l2 不为空
         * 2.进位不为0 即：l1和l2循环完之后还有进位
         */
        while (l1 != null || l2 != null || other != 0){
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int sum = v1 + v2 + other;
            //取十位
            other = sum / 10;
            //取个位
            ListNode sumNode = new ListNode(sum % 10);
            //连接
            newNode.next = sumNode;
            //移位
            newNode = sumNode;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
    }
}

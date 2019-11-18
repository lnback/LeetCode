import javax.xml.soap.Node;

/**
 * @program: LeetCode *
 * @classname: T83 *
 * @author: lnback *
 * @create: 2019-11-18 19:34
 **/

public class T83 {
    public static ListNode deleteDuplicates(ListNode head) {
        for(ListNode node = head;node != null && node.next != null;){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}

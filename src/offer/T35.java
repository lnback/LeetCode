package offer;

import java.awt.*;

/**
 * @program: LeetCode *
 * @classname: T35 *
 * @author: lnback *
 * @create: 2020-07-30 16:07
 **/

public class T35 {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        for(Node temp = head,copy = null;temp != null;temp = temp.next.next){
            copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
        }

        for(Node temp = head ; temp != null;temp = temp.next.next){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
        }

        Node newHead = head.next;
        Node cur = newHead;
        for(Node temp = head;temp != null;){
            temp.next = temp.next.next;
            temp = temp.next;
            if(cur.next != null){
                cur.next = cur.next.next;
                cur = cur.next;
            }
        }
        return newHead;
    }
}

package HOT100;



import java.util.Comparator;
import java.util.PriorityQueue;

public class T23 {
    public ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val < o2.val) return -1;
                else if (o1.val == o2.val) return 0;
                else return 1;
            }
        });

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for (ListNode node : lists){
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()){
            cur.next = queue.poll();
            cur = cur.next;
            if (cur.next != null) queue.add(cur.next);
        }
        return dummy.next;
    }
}

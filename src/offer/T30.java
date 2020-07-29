package offer;

/**
 * @program: LeetCode *
 * @classname: T30 *
 * @author: lnback *
 * @create: 2020-07-29 13:38
 **/

public class T30 {

    private Node head;

    /** initialize your data structure here. */
    public T30() {

    }

    public void push(int x) {
        if(head == null){
            head = new Node(x,x,null);
        }else {
            head = new Node(x,Math.min(head.min,x),head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    class Node{
        int val;
        int min;
        Node next;

        public Node(int val,int min,Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}

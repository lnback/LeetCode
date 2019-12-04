import java.util.Stack;

/**
 * @program: LeetCode *
 * @classname: T232 *
 * @author: lnback *
 * @create: 2019-12-03 11:38
 **/

public class T232 {
    /**
     * 栈模拟队列：
     * 双栈：s1作为输入栈，s2作为输出栈
     * pop时先判断s2是否为空，为空则将s1全部导入
     * peek相同操作
     */
    class MyQueue {
        private Stack<Integer> s1;
        private Stack<Integer> s2;
        /** Initialize your data structure here. */
        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            s1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }
}

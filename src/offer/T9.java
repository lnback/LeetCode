package offer;

import java.util.LinkedList;

/**
 * @program: LeetCode *
 * @classname: T9 *
 * @author: lnback *
 * @create: 2020-07-15 10:40
 **/

public class T9 {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public T9(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return -1;
            }else {
                while (!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            }
        }else {
            return stack2.pop();
        }
    }
}

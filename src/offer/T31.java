package offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode *
 * @classname: T31 *
 * @author: lnback *
 * @create: 2020-07-29 14:02
 **/

public class T31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        for (int num : pushed){
            stack.push(num);
            while (i < popped.length && !stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return i == popped.length;
    }
}

package module04_stack;

import java.util.ArrayDeque;

/**
 * Minimum Stack
 *
 * @author created by sunjy on 1/14/25
 */
public class MinStack {

    private final ArrayDeque<Integer> stack;
    private final ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}

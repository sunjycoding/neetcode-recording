package module04_stack;

import java.util.ArrayDeque;

/**
 * Evaluate Reverse Polish Notation
 *
 * @author created by sunjy on 1/14/25
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b + a);
                }
                case "-" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                }
                case "*" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b * a);
                }
                case "/" -> {

                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                }
                default -> stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}

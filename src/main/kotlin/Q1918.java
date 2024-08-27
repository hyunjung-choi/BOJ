

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위 표기식
 * https://www.acmicpc.net/problem/1918
 */

public class Q1918 {
    private static int getPriority(char c) {
        switch (c) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    private String toPostfix(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            int priority = getPriority(c);
            switch (c) {
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!stack.isEmpty() && getPriority(stack.peek()) >= priority)
                        sb.append(stack.pop());
                    stack.push(c);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(')
                        sb.append(stack.pop());
                    if (!stack.isEmpty())
                        stack.pop();
                    break;
                default:
                    sb.append(c);
            }
        }
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(new Q1918().toPostfix(str));
    }
}


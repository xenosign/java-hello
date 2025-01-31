package tomAndHarry.collection.stack;

import java.util.Stack;

public class StackExample2_2 {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                continue;
            }

            if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String tc1 = "(())()";
        String tc2 = "(())(()";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
    }
}

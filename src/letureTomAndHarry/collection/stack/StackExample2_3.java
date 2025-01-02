package letureTomAndHarry.collection.stack;

import java.util.ArrayDeque;

public class StackExample2_3 {
    public static boolean solution(String s) {
        // 실무에서는 불필요한 오버헤드가 없는 ArrayDeque 사용
        ArrayDeque<Character> stack = new ArrayDeque<>();

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

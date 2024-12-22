package tomAndHarry.collection.stack;

import java.util.Stack;

public class StackExample {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        // 문자열의 각 문자에 대해 반복
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // 열린 괄호는 스택에 추가
                stack.push(c);

            } else if (c == ')') {
                // 닫힌 괄호를 만났을 때 스택이 비어있으면 false 반환
                if (stack.isEmpty()) {
                    return false;
                }
                // 스택에서 열린 괄호를 하나 제거
                stack.pop();
            }
        }

        // 반복이 끝난 후 스택이 비어 있으면 true, 아니면 false 반환
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String tc1 = "(())()";
        String tc2 = "(())(()";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
    }
}

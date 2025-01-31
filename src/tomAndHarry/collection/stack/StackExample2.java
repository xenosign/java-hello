package tomAndHarry.collection.stack;

import java.util.Stack;

public class StackExample2 {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        // 1. 열린 괄호 ”(“ 를 만나면? 스택에 넣는다 (push)
        // 2. 닫힌 괄호를 ”)” 만나면? 스택에 있는 애를 뽑는다 (pop)
        // 3. 문자열이 끝났어요
        //    스택이 비었으면? -> 완벽한 괄호 -> True
        //    스택이 안비었으면? -> False
        // 4. 문자열이 안끝났어요
        //    스택이 비었으면? -> False
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }


        boolean isPerfect = stack.isEmpty();

        return isPerfect;
    }

    public static void main(String[] args) {
        String tc1 = "()()"; // true
        String tc2 = "()()("; // false
        String tc3 = "())"; // false
        String tc4 = "((((((()))()()))))()()())(())))"; // false

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
        System.out.println(solution(tc3));
        System.out.println(solution(tc4));
    }
}


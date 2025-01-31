package tomAndHarry.collection.stack;

import java.util.Stack;

public class StackExample1_2 {
    public static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String reverseStr = "";

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reverseStr += stack.pop();
        }

        return reverseStr;
    }

    public static void main(String[] args) {
        String tc1 = "가나다";
        String tc2 = "김시완";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
    }
}

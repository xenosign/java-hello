package letureTomAndHarry.collection.stack;

import java.util.Stack;

public class StackExample1 {
    public static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String reverseStr = "";

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            reverseStr += stack.pop();
        }

        while (!stack.isEmpty()) {
            reverseStr += stack.pop();
        }

        return reverseStr;
    }

    public static void main(String[] args) {
        String tc1 = "가나다";
        String tc2 = "김연비";
        String tc3 = "김시완";
        String tc4 = "김수민";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
        System.out.println(solution(tc3));
        System.out.println(solution(tc4));
    }
}


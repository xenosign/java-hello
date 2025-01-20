package letureTomAndHarry.assignment;

import java.util.LinkedList;
import java.util.Stack;

public class Assignment04 {

    public static void main(String[] args) {
        String tc1 = "가나다라마";
        String tc2 = "NO";
        String tc3 = "Now I Won";
        String tc4 = "^__";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
        System.out.println(solution(tc3));
        System.out.println(solution(tc4));

    }

    public static String solution(String str) {
        String result = str;
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            result += stack.pop();
        }

        return result;
    }
}
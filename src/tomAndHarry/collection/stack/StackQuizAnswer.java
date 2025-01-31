package tomAndHarry.collection.stack;

import java.util.Stack;

// 팰린드롬(Palindrome, 회문) 검증하기
public class StackQuizAnswer {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int strLen = s.length();

        for (int i = 0; i < strLen / 2; i++) {
            stack.push(s.charAt(i));
        }

        int startIdx = (strLen % 2 == 0) ? strLen / 2 : strLen / 2 + 1;

        for (int i = startIdx; i < strLen; i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.pop()) return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String tc1 = "level";
        String tc2 = "우영우";
        String tc3 = "역삼역";
        String tc4 = "이효석";
        String tc5 = "알고리즘";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
        System.out.println(solution(tc3));
        System.out.println(solution(tc4));
        System.out.println(solution(tc5));
    }
}

package tomAndHarry.collection.stack;

// 실제 문제 1
// https://school.programmers.co.kr/learn/courses/30/lessons/12909

import java.util.Stack;

public class StackFundamental {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack 확인
        System.out.println(stack);

        // 맨 위 요소 확인 (peek)
        System.out.println("제일 꼭대기의 값 : " + stack.peek());  // 3

        // 요소 제거 (pop)
        System.out.println("꺼낸 값 : " + stack.pop());  // 3

        // 스택이 비어있는지 확인
        System.out.println("스택이 비었는가? " + stack.isEmpty());  // false

        // 스택의 크기
        System.out.println("스택에 저장 된 원소 수 : " + stack.size());  // 2

        // 특정 요소 포함 여부 확인
        System.out.println("스택에 1 이 있는가? " + stack.contains(1));  // true
    }
}

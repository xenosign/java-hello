package letureTomAndHarry.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFundamental {
    public static void main(String[] args) {
        // Queue는 인터페이스이므로 LinkedList로 구현
        Queue<Integer> queue = new LinkedList<>();

        // 요소 추가 (enqueue)
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // queue 확인
        System.out.println(queue);

        // 맨 앞 요소 확인 (peek)
        System.out.println("제일 처음 저장 된 값 : " + queue.peek());  // 1

        // 요소 제거 (dequeue)
        System.out.println("빠져 나온 값 : " + queue.remove());  // 1

        // 큐가 비어있는지 확인
        System.out.println("큐가 비었는가? " + queue.isEmpty());  // false

        // 큐의 크기
        System.out.println("큐에 저장 된 원소의 수 : " + queue.size());  // 2

        // 특정 요소 포함 여부 확인
        System.out.println("큐에 2 가 들어있는가? " + queue.contains(2));  // true
    }
}
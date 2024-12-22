package letureTomAndHarry.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 데이터 추가 시간 비교
        System.out.println("=== 데이터 추가 성능 비교 ===");

        // ArrayList 끝에 추가
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long arrayListEndAddTime = System.nanoTime() - startTime;
        System.out.println("ArrayList 끝에 추가: " + arrayListEndAddTime + "ns");

        // LinkedList 끝에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long linkedListEndAddTime = System.nanoTime() - startTime;
        System.out.println("LinkedList 끝에 추가: " + linkedListEndAddTime + "ns");

        // 끝에 추가 성능 비교
        printPerformanceComparison("끝에 추가", arrayListEndAddTime, linkedListEndAddTime);

        // 중간에 데이터 추가 시간 비교
        System.out.println("\n=== 중간에 데이터 추가 성능 비교 ===");

        // ArrayList 중간에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(500, i);
        }
        long arrayListMiddleAddTime = System.nanoTime() - startTime;
        System.out.println("ArrayList 중간에 추가: " + arrayListMiddleAddTime + "ns");

        // LinkedList 중간에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(500, i);
        }
        long linkedListMiddleAddTime = System.nanoTime() - startTime;
        System.out.println("LinkedList 중간에 추가: " + linkedListMiddleAddTime + "ns");

        // 중간 추가 성능 비교
        printPerformanceComparison("중간에 추가", arrayListMiddleAddTime, linkedListMiddleAddTime);

        // 데이터 접근 시간 비교
        System.out.println("\n=== 데이터 접근 성능 비교 ===");

        // ArrayList 접근
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        long arrayListAccessTime = System.nanoTime() - startTime;
        System.out.println("ArrayList 데이터 접근: " + arrayListAccessTime + "ns");

        // LinkedList 접근
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        long linkedListAccessTime = System.nanoTime() - startTime;
        System.out.println("LinkedList 데이터 접근: " + linkedListAccessTime + "ns");

        // 접근 성능 비교
        printPerformanceComparison("데이터 접근", arrayListAccessTime, linkedListAccessTime);

        // 데이터 삭제 시간 비교
        System.out.println("\n=== 데이터 삭제 성능 비교 ===");

        // ArrayList 중간 데이터 삭제
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(500);
        }
        long arrayListRemoveTime = System.nanoTime() - startTime;
        System.out.println("ArrayList 중간 데이터 삭제: " + arrayListRemoveTime + "ns");

        // LinkedList 중간 데이터 삭제
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(500);
        }
        long linkedListRemoveTime = System.nanoTime() - startTime;
        System.out.println("LinkedList 중간 데이터 삭제: " + linkedListRemoveTime + "ns");

        // 삭제 성능 비교
        printPerformanceComparison("중간 데이터 삭제", arrayListRemoveTime, linkedListRemoveTime);
    }

    private static void printPerformanceComparison(String operation, long arrayListTime, long linkedListTime) {
        double ratio;
        String fasterList;

        if (arrayListTime < linkedListTime) {
            ratio = ((double) linkedListTime / arrayListTime - 1) * 100;
            fasterList = "ArrayList";
        } else {
            ratio = ((double) arrayListTime / linkedListTime - 1) * 100;
            fasterList = "LinkedList";
        }

        System.out.printf("→ %s에서 %s가 약 %.2f%% 더 빠름%n",
                operation, fasterList, ratio);
    }
}
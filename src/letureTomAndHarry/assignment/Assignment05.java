package letureTomAndHarry.assignment;

import java.util.*;

public class Assignment05 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;

        Set<Integer> set1 = new TreeSet<>();
        while (set1.size() < size) {
            set1.add(random.nextInt(20) + 1);
        }

        Set<Integer> set2 = new TreeSet<>();
        while (set2.size() < size) {
            set2.add(random.nextInt(20) + 1);
        }

        // 교집합과 포함되지 않는 숫자 구하기
        Set<Integer> intersection = solution1(set1, set2);
        Set<Integer> notIncluded = solution2(set1, set2);

        System.out.println("첫 번째 Set : " + set1);
        System.out.println("두 번째 Set : " + set2);
        System.out.println("교집합: " + intersection);
        System.out.println("포함되지 않는 숫자들: " + notIncluded);
    }

    // 교집합을 구하는 메서드
    public static Set<Integer> solution1(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);

        return intersection;
    }

    // 포함되지 않는 숫자를 구하는 메서드
    public static Set<Integer> solution2(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> allNumbers = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            allNumbers.add(i);
        }

        allNumbers.removeAll(set1);
        allNumbers.removeAll(set2);

        return allNumbers;
    }
}
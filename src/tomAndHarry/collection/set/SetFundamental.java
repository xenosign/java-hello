package tomAndHarry.collection.set;

import java.util.*;

public class SetFundamental {
    public static void main(String[] args) {
        // 1. HashSet 생성
        Set<String> homework = new HashSet<>();

        // 2. 요소 추가 (add)
        homework.add("연비");
        homework.add("시완");
        homework.add("수민");
        homework.add("규찬");
        homework.add("규찬");
        System.out.println("homework set: " + homework);  // 중복은 저장 불가능

        // 3. 크기 확인 (size)
        System.out.println("Set 크기: " + homework.size());

        // 4. 포함 여부 확인 (contains)
        System.out.println("시완 포함 여부: " + homework.contains("시완"));
        System.out.println("태웅 포함 여부: " + homework.contains("태웅"));

        // 5. 요소 제거 (remove)
        homework.remove("규찬");
        System.out.println("규찬 제거 후: " + homework);

        // 6. Set을 배열로 변환
        String[] homeworkArray = homework.toArray(new String[homework.size()]);
        System.out.println("배열로 변환: " + Arrays.toString(homeworkArray));

        // 7. 반복문으로 요소 순회
        System.out.println("요소 순회:");
        for (String person : homeworkArray) {
            System.out.println(person);
        }

        // 8. Set 비우기 (clear)
        homework.clear();
        System.out.println("Set이 비었는지 확인: " + homework.isEmpty());


        // 9. Set 간의 집합 연산
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

        // 합집합
        Set<String> union = new HashSet<>(set1); // A, B, C
        union.addAll(set2); // A, B, C, D
        System.out.println("합집합: " + union); // A, B, C, D

        // 교집합
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // B, C
        System.out.println("교집합: " + intersection); // B, C

        // 차집합
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합: " + difference); // A

        // 10. TreeSet 사용 예제 (정렬된 Set)
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        System.out.println("정렬된 숫자: " + numbers);  // 자동으로 정렬됨

        // 11. LinkedHashSet 사용 예제 (삽입 순서 유지)
        Set<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("첫번째");
        orderedSet.add("두번째");
        orderedSet.add("세번째");
        System.out.println("삽입 순서가 유지된 Set: " + orderedSet);

        Set<String> unorderedSet = new HashSet<>();
        unorderedSet.add("첫번째");
        unorderedSet.add("두번째");
        unorderedSet.add("세번째");
        System.out.println("삽입 순서가 유지안된 Set: " + unorderedSet);
    }


}

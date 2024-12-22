package letureTomAndHarry.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFundamental {
    public static void main(String[] args) {
        // 1. List에 숫자 추가하는 경우
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 배열의 값을 List에 추가
        List<Integer> numbers = new ArrayList<>();
        for (int num : array) {
            numbers.add(num);
        }

        System.out.println("원본 리스트: " + numbers);

        // 11 추가
        numbers.add(11);
        System.out.println("11 추가 후: " + numbers);

        // 2. List에서 숫자 삭제하는 경우
        System.out.println("\n=== List에서 숫자 삭제하기 ===");
        System.out.println("원본 리스트: " + numbers);

        // 11 삭제
        numbers.remove(Integer.valueOf(11));  // 값으로 삭제
        System.out.println("11 삭제 후: " + numbers);

        // 3. List에서 중간값(5) 삭제하는 경우
        System.out.println("\n=== List에서 5 삭제하기 ===");
        System.out.println("원본 리스트: " + numbers);

        // 5 삭제
        numbers.remove(Integer.valueOf(5));  // 값으로 삭제
        System.out.println("5 삭제 후: " + numbers);

        // 추가로 List의 유용한 메서드들
        System.out.println("\n=== List의 추가 기능들 ===");

        // 특정 위치에 값 추가
        numbers.add(2, 15);  // 인덱스 2에 15 추가
        System.out.println("인덱스 2에 15 추가: " + numbers);

        // 특정 위치의 값 변경
        numbers.set(2, 20);  // 인덱스 2의 값을 20으로 변경
        System.out.println("인덱스 2의 값을 20으로 변경: " + numbers);

        // 특정 값의 위치 찾기
        int index = numbers.indexOf(20);
        System.out.println("20의 위치: " + index);

        // 부분 리스트 추출
        List<Integer> subList = numbers.subList(2, 5);
        System.out.println("인덱스 2부터 4까지의 부분 리스트: " + subList);

        // 리스트 크기 확인
        System.out.println("리스트의 크기: " + numbers.size());

        // 리스트가 비어있는지 확인
        System.out.println("리스트가 비어있는가? " + numbers.isEmpty());

        // 특정 값이 포함되어 있는지 확인
        System.out.println("리스트에 20이 있는가? " + numbers.contains(20));
    }
}
package tomAndHarry.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFundamental {
    public static void main(String[] args) {
        // int -> Integer (Wrapper Class)
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        // 1. 배열에 숫자 추가하는 경우
        numbers.add(11);
        System.out.println(numbers);

        // 2. 배열에서 숫자 삭제하는 경우
        // numbers.remove(11); // index 가 11 인 애를 지워라
        numbers.remove(Integer.valueOf(11)); // 값이 11 인 애를 지워라
        System.out.println(numbers);

        // 3. 배열에서 중간값(5) 삭제하는 경우
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);

        // 추가로 List의 유용한 메서드들
        // 특정 위치에 값 추가
        numbers.add(4, 5);
        System.out.println(numbers);
        // 특정 위치의 값 변경
        numbers.set(4, 55);
        System.out.println(numbers);
        // 특정 값의 위치 찾기
        int findIdx = numbers.indexOf(7);
        numbers.set(findIdx, 555);
        System.out.println(numbers);
        // 리스트 크기 확인
        System.out.println("리스트의 크기는 ? : " + numbers.size());
        // 리스트가 비어있는지 확인
        System.out.println("리스트가 비었는지? : " + numbers.isEmpty());
        // 특정 값이 포함되어 있는지 확인
        System.out.println("특정 값이 리스트에 포함되었는지? : " + numbers.contains(555));
    }
}
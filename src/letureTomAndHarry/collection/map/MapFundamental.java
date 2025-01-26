package letureTomAndHarry.collection.map;

import java.util.*;

public class MapFundamental {
    public static void main(String[] args) {
        Map<String, Integer> homework = new HashMap<>();

        // 요소 추가 (put)
        homework.put("연비", 95);
        homework.put("시완", 88);
        homework.put("수민", 92);
        homework.put("규찬", 85);
        homework.put("규찬", 90); // 동일 키에 대해 값이 업데이트됨
        System.out.println("homework map: " + homework);

        // 크기 확인
        System.out.println("Map 크기: " + homework.size());

        // 키 존재 여부 확인
        System.out.println("시완 포함 여부: " + homework.containsKey("시완"));
        System.out.println("태웅 포함 여부: " + homework.containsKey("태웅"));

        // 값 가져오기
        System.out.println("시완의 점수: " + homework.get("시완"));
        System.out.println("태웅의 점수: " + homework.get("태웅"));
        System.out.println("시완의 점수: " + homework.getOrDefault("시완", 0));
        System.out.println("태웅의 점수: " + homework.getOrDefault("태웅", 0)); // 기본값 지정


        // 요소 제거
        homework.remove("규찬");
        System.out.println("규찬 제거 후: " + homework);

        // 모든 학생과 점수 출력
        System.out.println("\n모든 학생의 점수:");

        for (Map.Entry<String, Integer> entry : homework.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "점");
        }
    }
}

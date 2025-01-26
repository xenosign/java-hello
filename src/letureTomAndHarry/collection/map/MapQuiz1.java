package letureTomAndHarry.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapQuiz1 {
    public static void main(String[] args) {
        Map<String, Integer> homework = new HashMap<>();

        homework.put("연비", 95);
        homework.put("시완", 88);
        homework.put("수민", 92);
        homework.put("규찬", 85);
        System.out.println("homework map: " + homework);

        String topStudent = getTopStudent(homework);
        System.out.println("최고 점수를 가진 사람: " + topStudent);
    }

    static public String getTopStudent(Map<String, Integer> studentList) {
        // 여기를 완성해 주세요
        return "";
    }
}

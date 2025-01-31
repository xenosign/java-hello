package tomAndHarry.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> homework = new HashMap<>();

        homework.put("연비", 95);
        homework.put("시완", 88);
        homework.put("수민", 92);
        homework.put("규찬", 85);
        System.out.println("homework map: " + homework);

        String studentToFind = "연비";
        int score = getScoreWithName(homework, studentToFind);
        System.out.println(studentToFind + " 님의 점수는 : " + score);
    }

    static public Integer getScoreWithName(Map<String, Integer> studentList, String name) {
        return studentList.get(name);
    }
}

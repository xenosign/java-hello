package tomAndHarry.collection.map2;

import java.util.HashMap;
import java.util.Map;

public class MapAssignment1 {
    public static void main(String[] args) {
        String[] tc1 = {"apple", "banana", "strawberry", "cherry", "grape", "apple", "banana", "apple"};
        String[] tc2 = {"연비", "시완", "수민", "태웅", "규찬", "시완", "태웅"};
        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
    }


    public static String solution(String[] strings) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        String mostFrequent = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}

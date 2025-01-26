package letureTomAndHarry.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapQuiz2a {
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "strawberry", "grape", "strawberry"};

        System.out.println(findMostFrequentWord(fruits));
    }

    static public String findMostFrequentWord(String[] words) {
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequency);

        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return mostFrequentWord;
    }
}

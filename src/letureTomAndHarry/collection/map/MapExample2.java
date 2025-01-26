package letureTomAndHarry.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        String tc1 = "banana";
        String tc2 = "apple";
        String tc3 = "우영우";

        System.out.println(findMostFrequentChar(tc1));
        System.out.println(findMostFrequentChar(tc2));
        System.out.println(findMostFrequentChar(tc3));
    }

    static public char findMostFrequentChar(String word) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        System.out.println(frequency);

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }
}

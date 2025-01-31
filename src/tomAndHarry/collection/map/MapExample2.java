package tomAndHarry.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        String tc1 = "banana"; // a
        String tc2 = "apple"; // p
        String tc3 = "우영우"; // 우

        System.out.println(findMostFrequentChar(tc1));
        System.out.println(findMostFrequentChar(tc2));
        System.out.println(findMostFrequentChar(tc3));
    }

    static public char findMostFrequentChar(String word) {
        Map<Character, Integer> frequency = new HashMap<>();

        // "우영우" -> ["우", "영", "우"]
        // "우" -> 1
        // "영" -> 1
        // "우" -> 1 + 1 = 2
        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        System.out.println(frequency);
        // "우" -> 2 / "영" -> 1

        char maxChar = ' ';
        int maxCount = Integer.MIN_VALUE;

        // "우" -> 2 / "영" -> 1
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            // {"영", 1}
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue(); // 2
                maxChar = entry.getKey(); // "우"
            }
        }

        return maxChar;
    }
}

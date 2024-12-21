package tomAndHarry.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMapExample {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 8, 3, 2, 1, 3, 5, 7, 8};

        int digitCount = 0;
        int maxCountNum = 0;
        int maxCount = 0;

        Set<Integer> numSet = new HashSet<>();
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numSet.add(num);
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        digitCount = numSet.size();

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() > maxCountNum) {
                maxCountNum = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("배열에 있는 총 숫자 종류의 수는 ? " + digitCount);
        System.out.println("배열에서 제일 많이 나온 수는 ? " + maxCountNum + " 이고, 총 " + maxCount + "번 나왔습니다.");
        System.out.println(numMap);
    }
}

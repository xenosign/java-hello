package letureTomAndHarry.collection.set;


import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums2 = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(intersection2(nums1, nums2));
        System.out.println(union(nums1, nums2));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // 첫 번째 배열의 숫자들을 Set에 저장
        for (int num : nums1) {
            set1.add(num);
        }

        // set1 -> {1, 2, 3, 4, 5, 6, 7, 8};
        // 두 번째 배열을 순회하며 교집합 찾기
        for (int num : nums2) { // {2, 4, 6, 8, 10, 12, 14, 16};
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Set을 배열로 변환
        // {2, 4, 6, 8}
        // []
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    static Set<Integer> intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // 첫 번째 배열의 숫자들을 Set에 저장
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            intersection.add(num);
        }

        // set1 -> {1, 2, 3, 4, 5, 6, 7, 8};
        // intersection -> {2, 4, 6, 8, 10, 12, 14, 16};
        intersection.retainAll(set1);

        return intersection;
    }

    static Set<Integer> union(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> union = new HashSet<>();

        // 첫 번째 배열의 숫자들을 Set에 저장
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            union.add(num);
        }

        union.addAll(set1);

        return union;
    }
}

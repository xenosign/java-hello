package letureTomAndHarry.collection.set;

import java.util.*;

public class SetExample1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 5, 2, 1, 6, 3};
        int[] nums2 = {1, 3, 4, 5, 2, 9, 6, 10};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // 중복 발견
            }
            set.add(num);
        }
        return false;
    }
}

package DSA.Day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctIntegers {
    public List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add all elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Find distinct integers in nums1 that are not in nums2
        List<Integer> distinct1 = new ArrayList<>();
        for (int num : nums1) {
            if (!set2.contains(num)) {
                distinct1.add(num);
            }
        }
        result.add(distinct1);

        // Find distinct integers in nums2 that are not in nums1
        List<Integer> distinct2 = new ArrayList<>();
        for (int num : nums2) {
            if (!set1.contains(num)) {
                distinct2.add(num);
            }
        }
        result.add(distinct2);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        DistinctIntegers solution = new DistinctIntegers();
        List<List<Integer>> distinctIntegers = solution.findDistinctIntegers(nums1, nums2);

        // Print the resulting distinct integers
        System.out.println(distinctIntegers);
    }
}


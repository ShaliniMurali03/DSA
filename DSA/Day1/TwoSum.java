package DSA.Day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the complement of each number and its index
        Map<Integer, Integer> complements = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            // Check if the complement of the current number exists in the map
            if (complements.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{complements.get(complement), i};
            }

            // If the complement doesn't exist, add the current number and its index to the map
            complements.put(num, i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);  // Output: 0, 1
    }
}

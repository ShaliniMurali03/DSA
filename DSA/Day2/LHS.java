package DSA.Day2;
import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;
        for (int num : nums) {
            if (frequencyMap.containsKey(num + 1)) {
                int len = frequencyMap.get(num) + frequencyMap.get(num + 1);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
public class LHS {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLen = solution.findLHS(nums);
        System.out.println(longestSubsequenceLen);
    }
}

package DSA.Day5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DisappearedNumbers {
    public static List<List<Integer>> findDisappearedNumbers(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> missingNums1 = new ArrayList<>();
        List<Integer> missingNums2 = new ArrayList<>();

        for (int num : nums1) {
            if (!set2.contains(num)) {
                missingNums1.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num)) {
                missingNums2.add(num);
            }
        }

        answer.add(missingNums1);
        answer.add(missingNums2);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> answer = findDisappearedNumbers(nums1, nums2);

        // Print the resulting lists
        for (List<Integer> list : answer) {
            System.out.println(list);
        }
    }
}


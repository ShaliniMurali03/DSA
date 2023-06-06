package DSA.Day5;
import java.util.ArrayList;
import java.util.List;

public class Duplicates
{

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(num));
            } else {
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);

        // Print the resulting list
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}

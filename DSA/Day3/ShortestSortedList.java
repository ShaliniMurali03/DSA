package DSA.Day3;
import java.util.ArrayList;
import java.util.List;

public class ShortestSortedList {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        // Handle the range before the first number
        addRange(result, lower, (long) nums[0] - 1);

        // Handle the ranges between consecutive numbers
        for (int i = 1; i < nums.length; i++) {
            addRange(result, (long) nums[i - 1] + 1, (long) nums[i] - 1);
        }

        // Handle the range after the last number
        addRange(result, (long) nums[nums.length - 1] + 1, upper);

        return result;
    }

    private void addRange(List<String> result, long start, long end) {
        if (start > end) {
            return;
        }

        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        ShortestSortedList solution = new ShortestSortedList();
        List<String> ranges = solution.findMissingRanges(nums, lower, upper);

        // Print the resulting ranges
        for (String range : ranges) {
            System.out.println(range);
        }
    }
}


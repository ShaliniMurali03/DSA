package DSA.Day2;
import java.util.Arrays;

class Solution5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
        return maxProduct;
    }
}
public class MaximumProduct {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int[] nums = {1, 2, 3};
        int maxProduct = solution.maximumProduct(nums);
        System.out.println(maxProduct);
    }
}

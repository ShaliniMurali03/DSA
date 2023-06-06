package DSA.Day3;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            // Find the first element greater than the decreasing element
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            // Swap the decreasing element with the next greater element
            swap(nums, i, j);
        }

        // Reverse the elements after the decreasing element
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        NextPermutation solution = new NextPermutation();
        solution.nextPermutation(nums);

        // Print the resulting array
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


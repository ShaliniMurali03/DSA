package DSA.Day3;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // Perform bitwise XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        SingleNumber solution = new SingleNumber();
        int single = solution.singleNumber(nums);
        System.out.println(single);
    }
}


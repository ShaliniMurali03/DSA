package DSA.Day4;

public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int[] op : ops) {
            minX = Math.min(minX, op[0]);
            minY = Math.min(minY, op[1]);
        }

        return minX * minY;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};

        MaxCount solution = new MaxCount();
        int maxIntegers = solution.maxCount(m, n, ops);

        System.out.println(maxIntegers);
    }
}


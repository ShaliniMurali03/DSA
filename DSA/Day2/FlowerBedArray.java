package DSA.Day2;

class Solution4 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
public class FlowerBedArray {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean canPlant = solution.canPlaceFlowers(flowerbed, n);
        System.out.println(canPlant);
    }
}

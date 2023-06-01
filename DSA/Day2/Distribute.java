package DSA.Day2;
import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandyTypes = new HashSet<>();
        for (int type : candyType) {
            uniqueCandyTypes.add(type);
        }
        return Math.min(uniqueCandyTypes.size(), candyType.length / 2);
    }
}
public class Distribute {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxCandyTypes = solution.distributeCandies(candyType);
        System.out.println(maxCandyTypes);
    }
}

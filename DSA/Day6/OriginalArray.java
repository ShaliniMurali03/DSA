package DSA.Day6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OriginalArray
{
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // If the length of 'changed' is odd, it can't be a doubled array
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> originalList = new ArrayList<>();

        for (int num : changed) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed); // Sort the array in ascending order

        for (int num : changed) {
            if (frequencyMap.getOrDefault(num, 0) == 0) {
                continue; // Skip if the number has already been used
            }

            int doubledNum = num * 2;

            if (frequencyMap.getOrDefault(doubledNum, 0) == 0) {
                return new int[0]; // If the doubled number is not found, 'changed' is not a doubled array
            }

            originalList.add(num); // Add the original number to the list
            frequencyMap.put(num, frequencyMap.get(num) - 1); // Decrease the frequency of the original number
            frequencyMap.put(doubledNum, frequencyMap.get(doubledNum) - 1); // Decrease the frequency of the doubled number
        }

        int[] originalArray = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            originalArray[i] = originalList.get(i);
        }

        return originalArray;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}


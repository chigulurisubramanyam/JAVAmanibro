import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the indices of elements
        Map<Integer, Integer> numIndices = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Calculate the complement needed to achieve the target sum
            int complement = target - num;
            // If the complement exists in the HashMap, return the indices
            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }
            // Store the index of the current element in the HashMap
            numIndices.put(num, i);
        }

        // If no solution is found
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }
}

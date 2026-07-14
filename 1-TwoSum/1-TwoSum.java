// Last updated: 7/14/2026, 1:55:22 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number value -> its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // Return indices of the complement and current number
                return new int[] { numMap.get(complement), i };
            }
            
            // Store the current number and its index in the map
            numMap.put(nums[i], i);
        }
        
        // Return empty array if no solution found (problem guarantees one solution)
        return new int[] {};
    }
}   
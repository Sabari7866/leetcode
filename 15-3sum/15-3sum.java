// Last updated: 7/14/2026, 1:54:47 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Edge case: need at least 3 elements
        if (nums.length < 3) {
            return result;
        }
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Iterate through each element as the first number
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            
            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Step 3: Two-pointer approach
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move both pointers
                    left++;
                    right--;
                    
                    // Skip duplicates for second element
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    
                    // Skip duplicates for third element
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    // Sum too small, move left pointer right
                    left++;
                } else {
                    // Sum too large, move right pointer left
                    right--;
                }
            }
        }
        
        return result;
    }
}   
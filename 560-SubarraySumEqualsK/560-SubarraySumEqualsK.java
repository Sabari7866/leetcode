// Last updated: 9/2/2026, 1:47:14 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1);
        
        for (int num : nums) {
            currentSum += num;
            
          
            count += prefixSumCounts.getOrDefault(currentSum - k, 0);
            
           
            prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}
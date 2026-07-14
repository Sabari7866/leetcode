// Last updated: 7/14/2026, 1:53:52 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        
        List<Integer> tails = new ArrayList<>();
        
        for (int num : nums) {
            if (tails.isEmpty() || num > tails.get(tails.size() - 1)) {
                tails.add(num);
            } else {
                int idx = Collections.binarySearch(tails, num);
                if (idx < 0) idx = -(idx + 1); 
                tails.set(idx, num);
            }
        }
        
        return tails.size();
    }
}   
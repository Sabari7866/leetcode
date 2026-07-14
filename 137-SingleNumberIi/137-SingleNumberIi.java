// Last updated: 7/14/2026, 1:54:08 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // Iterate over each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            
            // Count how many numbers have the i-th bit set
            for (int num : nums) {
                // Check if the i-th bit is 1
                if (((num >> i) & 1) == 1) {
                    bitCount++;
                }
            }
            
            // If count is not divisible by 3, the single number has this bit set
            if (bitCount % 3 != 0) {
                result |= (1 << i);
            }
        }
        
        return result;
    }
}   
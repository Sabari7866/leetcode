// Last updated: 7/14/2026, 1:53:20 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        // Iterate through the array
        for (int num : nums) {
            // Check if the number is divisible by 6 (even and divisible by 3)
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }

        // Calculate the average, handling the case where no numbers satisfy the condition
        if (count == 0) {
            return 0;
        } else {
            return sum / count; // Integer division rounds down as required
        }
    }
}
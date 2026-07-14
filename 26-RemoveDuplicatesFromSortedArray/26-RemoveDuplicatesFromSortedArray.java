// Last updated: 7/14/2026, 1:54:37 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // k will track the position for the next unique element

        // Iterate from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Place the unique element at position k
                k++; // Increment k to point to the next available position for a unique element
            }
        }
        return k; // k represents the count of unique elements, which is the new length
    }
}
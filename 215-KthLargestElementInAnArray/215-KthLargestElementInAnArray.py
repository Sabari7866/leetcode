# Last updated: 7/15/2026, 2:41:43 PM
class Solution:
    def findKthLargest(self, nums, k):
        nums.sort(reverse=True)
        return nums[k-1]
        
# Last updated: 7/15/2026, 11:28:35 AM
1class Solution:
2    def findKthLargest(self, nums, k):
3        nums.sort(reverse=True)
4        return nums[k-1]
5        
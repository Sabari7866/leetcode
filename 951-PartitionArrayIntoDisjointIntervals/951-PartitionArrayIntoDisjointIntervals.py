# Last updated: 9/2/2026, 1:46:48 PM
class Solution:
    def partitionDisjoint(self, nums):
        left_max = nums[0]
        max_so_far = nums[0]
        ans = 0

        for i in range(1, len(nums)):
            max_so_far = max(max_so_far, nums[i])

            if nums[i] < left_max:
                left_max = max_so_far
                ans = i

        return ans + 1
# Last updated: 7/14/2026, 1:53:44 PM
class Solution:
    def minMoves(self, nums: List[int]) -> int:
        
        min_value = min(nums)
      
        total_sum = sum(nums)
      
       
        return total_sum - min_value * len(nums)

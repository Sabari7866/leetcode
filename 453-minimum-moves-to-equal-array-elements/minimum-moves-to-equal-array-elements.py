class Solution:
    def minMoves(self, nums: List[int]) -> int:
        
        min_value = min(nums)
      
        total_sum = sum(nums)
      
       
        return total_sum - min_value * len(nums)

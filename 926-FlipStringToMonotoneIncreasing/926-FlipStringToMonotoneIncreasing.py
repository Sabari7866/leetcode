# Last updated: 9/7/2026, 12:16:55 PM
class Solution:
    def minFlipsMonoIncr(self, s):

        flips = 0
        count_ones = 0
        
        for char in s:
            if char == '1':
                count_ones += 1
            else:
                # Decide to flip the current '0' to '1' or flip all previous '1's to '0'
                flips = min(flips + 1, count_ones)
                
        return flips

# Last updated: 8/4/2026, 12:43:01 PM
1class Solution:
2    def minFlipsMonoIncr(self, s):
3
4        flips = 0
5        count_ones = 0
6        
7        for char in s:
8            if char == '1':
9                count_ones += 1
10            else:
11                # Decide to flip the current '0' to '1' or flip all previous '1's to '0'
12                flips = min(flips + 1, count_ones)
13                
14        return flips
15
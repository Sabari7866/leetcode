# Last updated: 7/14/2026, 1:54:34 PM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        # Get lengths of both strings
        h_len, n_len = len(haystack), len(needle)
        
        # Traverse haystack only up to where the needle can fully fit
        for i in range(h_len - n_len + 1):
            # Check if the substring matches the needle
            if haystack[i : i + n_len] == needle:
                return i
                
        # Return -1 if no match is found
        return -1

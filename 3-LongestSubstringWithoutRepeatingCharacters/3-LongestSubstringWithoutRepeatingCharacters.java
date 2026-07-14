// Last updated: 7/14/2026, 1:55:17 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map to store the last index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is repeated within the current window
            if (charIndexMap.containsKey(currentChar)) {
                // Move left pointer to the right of the previous occurrence
                // Math.max ensures we don't move left backwards
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the last seen index of the character
            charIndexMap.put(currentChar, right);
            
            // Calculate current window length and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}   
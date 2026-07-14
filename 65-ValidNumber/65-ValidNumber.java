// Last updated: 7/14/2026, 1:54:21 PM
class Solution {
    public boolean isNumber(String s) {
        if (s == null) return false;
        s = s.trim();
        if (s.length() == 0) return false;
        
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '.') {
                // Dot cannot appear after an exponent or if already seen
                if (seenDot || seenExponent) {
                    return false;
                }
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                // Exponent cannot appear twice, and requires a preceding digit
                if (seenExponent || !seenDigit) {
                    return false;
                }
                seenExponent = true;
                // Reset seenDigit because exponent part must have its own digits
                seenDigit = false; 
            } else if (c == '+' || c == '-') {
                // Sign is valid only at start or immediately after 'e'/'E'
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else {
                // Any other character is invalid
                return false;
            }
        }
        
        // Must have seen at least one digit (covers cases like "1e", ".", "+")
        return seenDigit;
    }
}   
// Last updated: 7/14/2026, 1:53:48 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0; 
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }
}
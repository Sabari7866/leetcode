// Last updated: 7/14/2026, 1:54:53 PM
class Solution {
    public String intToRoman(int num) {
        // Value-symbol pairs including subtractive notation
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        // Greedily subtract largest values first
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        
        return sb.toString();
    }
}   
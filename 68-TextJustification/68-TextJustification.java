// Last updated: 7/14/2026, 1:54:19 PM
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;
        
        while (i < n) {
            int j = i + 1;
            int lineLength = words[i].length();
            
            // Greedily find how many words can fit in the current line
            while (j < n && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }
            
            StringBuilder sb = new StringBuilder();
            int numWords = j - i;
            int numGaps = numWords - 1;
            
            // Case 1: Last line or a line with only one word -> Left Justified
            if (j == n || numWords == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }
                // Pad the remaining spaces on the right
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } 
            // Case 2: Regular line with multiple words -> Fully Justified
            else {
                // Total letters in the current line without any space
                int totalLetters = 0;
                for (int k = i; k < j; k++) {
                    totalLetters += words[k].length();
                }
                
                int totalSpaces = maxWidth - totalLetters;
                int baseSpaces = totalSpaces / numGaps;
                int extraSpaces = totalSpaces % numGaps;
                
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        // Distribute base spaces
                        for (int s = 0; s < baseSpaces; s++) {
                            sb.append(" ");
                        }
                        // Distribute remainder extra spaces to the left slots
                        if (extraSpaces > 0) {
                            sb.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }
            
            result.add(sb.toString());
            i = j; // Move to the next set of words
        }
        
        return result;
    }
}

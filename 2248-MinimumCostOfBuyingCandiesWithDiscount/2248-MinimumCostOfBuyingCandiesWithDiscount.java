// Last updated: 7/14/2026, 1:53:25 PM
import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
       
        Arrays.sort(cost);
        
        int totalCost = 0;
        int n = cost.length;
        
       
        for (int i = 0; i < n; i++) {
            
            if (i % 3 != 2) {
                totalCost += cost[n - 1 - i];
            }
        }
        
        return totalCost;
    }
}   
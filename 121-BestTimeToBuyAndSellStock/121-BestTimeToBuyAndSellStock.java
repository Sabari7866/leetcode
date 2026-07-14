// Last updated: 7/14/2026, 1:54:09 PM
import java.lang.Math;
class Solution {
    public int maxProfit(int[] prices) {
     
        int minPrice = Integer.MAX_VALUE;
       
        int maxProfit = 0;

        
        for (int price : prices) {
          
            minPrice = Math.min(minPrice, price);
            
          
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
       
        return maxProfit;
    }
}

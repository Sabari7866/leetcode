// Last updated: 7/14/2026, 1:53:36 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
           int oddCount = 0;
        int evenCount = 0;
          for (int i : position) {
             if (i % 2 != 0) {
                oddCount++;
            } else {
                   evenCount++;
            }
        }
          return Math.min(oddCount, evenCount);
    }
}

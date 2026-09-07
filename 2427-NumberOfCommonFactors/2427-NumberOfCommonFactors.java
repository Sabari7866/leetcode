// Last updated: 9/7/2026, 12:16:14 PM
class Solution {
    public int commonFactors(int a, int b) {
        int g = gcd(a, b);
        int count = 0;
       
        for (int x = 1; x * x <= g; x++) {
            if (g % x == 0) {
                count++;
                if (x * x != g) {
                    count++;  
                }
            }
        }
        return count;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}

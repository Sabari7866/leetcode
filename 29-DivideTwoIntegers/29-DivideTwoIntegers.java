// Last updated: 7/14/2026, 1:54:33 PM
class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the specific overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        // XOR returns true if signs are different
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Work with positive long values to avoid overflow during Math.abs
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);
        
        long quotient = 0;

        // Subtract divisor multiples from dividend
        while (lDividend >= lDivisor) {
            long tempDivisor = lDivisor;
            long multiple = 1;

            // Find the largest multiple such that (divisor * multiple <= dividend)
            // We use bitwise shifting: tempDivisor << 1 is equivalent to tempDivisor * 2
            while (lDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest found multiple from dividend
            lDividend -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign
        return isNegative ? (int) -quotient : (int) quotient;
    }
}   
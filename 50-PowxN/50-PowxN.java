// Last updated: 7/14/2026, 1:54:29 PM
class Solution {
    public double myPow(double x, int n) {
        // Cast to long to handle Integer.MIN_VALUE overflow
        long N = n;
        
        // Handle negative exponents
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        // Binary exponentiation loop
        while (N > 0) {
            // If the current bit is 1, multiply the result by the current product
            if ((N % 2) == 1) {
                result *= currentProduct;
            }
            
            // Square the product for the next bit
            currentProduct *= currentProduct;
            
            // Shift to the next bit
            N /= 2;
        }

        return result;
    }
}   
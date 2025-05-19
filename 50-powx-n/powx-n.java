class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert n to long to avoid overflow
        if (N < 0) {
            x = 1 / x;
            N = -N; // Convert safely
        }
        
        double result = 1;
        while (N > 0) {
            if (N % 2 == 1) { // Agar odd hai
                result *= x;
            }
            x *= x; // Square karna
            N /= 2; // Half karna
        }
        return result;
    }
}
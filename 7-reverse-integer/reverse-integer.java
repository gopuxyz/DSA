class Solution {
    public int reverse(int x) {
        int rev = 0;
    
        while (x != 0) {
            // T: O(logx), S: O(1)
            int digit = x % 10;
            // 123
            if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (rev == Integer.MAX_VALUE / 10 && digit > 7) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            if (rev == Integer.MIN_VALUE / 10 && digit < -8) {
                return 0;
            }
            rev = rev * 10 + digit; // rev = 3, digit = 2
            // 3
            // 32
            // 321
            x = x / 10;
        }
        return rev;
    }
}

